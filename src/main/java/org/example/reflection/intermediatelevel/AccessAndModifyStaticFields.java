package org.example.reflection.intermediatelevel;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "ORIGINAL_KEY"; // Private static field

    public static String getApiKey() {
        return API_KEY;
    }
}

public class AccessAndModifyStaticFields {
    public static void main(String[] args) {
        try {
            // Load the Configuration class dynamically
            Class<?> configClass = Configuration.class;

            // Get the private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the field accessible (bypass private access)
            apiKeyField.setAccessible(true);

            // Modify the static field value
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
