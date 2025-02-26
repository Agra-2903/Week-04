package Annotations.PracticeProblems.AdvancedLevel;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();  // The role allowed to access the method
}

class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

class Service {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed successfully.");
    }

    public void invokeMethod(User user, String methodName) throws Exception {
        // Get the method by name
        var method = this.getClass().getMethod(methodName);

        // Check if the method has the RoleAllowed annotation
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            // Get the role allowed for this method
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();

            // Check if the user's role matches the required role
            if (user.getRole().equals(requiredRole)) {
                method.invoke(this);  // Allow access and invoke the method
            } else {
                System.out.println("Access Denied! You don't have the required role.");
            }
        } else {
            method.invoke(this);  // Invoke the method if no role restriction
        }
    }
}

public class RoleAccessTest {
    public static void main(String[] args) throws Exception {
        User adminUser = new User("ADMIN");
        User guestUser = new User("GUEST");

        Service service = new Service();

        // Try with ADMIN user
        System.out.println("Admin User:");
        service.invokeMethod(adminUser, "performAdminTask");

        // Try with GUEST user
        System.out.println("\nGuest User:");
        service.invokeMethod(guestUser, "performAdminTask");
    }
}
