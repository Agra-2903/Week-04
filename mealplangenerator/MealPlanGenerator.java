package org.example.mealplangenerator;

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();
        Meal<HighProteinMeal> highProteinMeals = new Meal<>();

        // Adding meals to different categories
        vegetarianMeals.addMeal(new VegetarianMeal("Grilled Paneer Salad", 450));
        vegetarianMeals.addMeal(new VegetarianMeal("Vegetable Stir Fry", 400));

        veganMeals.addMeal(new VeganMeal("Quinoa & Chickpea Bowl", 350));
        veganMeals.addMeal(new VeganMeal("Tofu Scramble", 320));

        ketoMeals.addMeal(new KetoMeal("Avocado & Bacon Wrap", 500));
        ketoMeals.addMeal(new KetoMeal("Salmon with Butter Sauce", 600));

        highProteinMeals.addMeal(new HighProteinMeal("Chicken Breast & Brown Rice", 550));
        highProteinMeals.addMeal(new HighProteinMeal("Protein Shake & Nuts", 480));

        // Displaying personalized meal plans
        System.out.println("Vegetarian Meal Plan:");
        for(MealPlan ve: vegetarianMeals.getPlan()){
            System.out.println("Meal: " + ve.getMealName());
            System.out.println("Calories: " + ve.getCalories());
        }

        System.out.println("\nVegan Meal Plan:");
        for(MealPlan ve: veganMeals.getPlan()){
            System.out.println("Meal: " + ve.getMealName());
            System.out.println("Calories: " + ve.getCalories());
        }

        System.out.println("\nKeto Meal Plan:");
        for(MealPlan k: ketoMeals.getPlan()){
            System.out.println("Meal: " + k.getMealName());
            System.out.println("Calories: " + k.getCalories());
        }

        System.out.println("\nHigh Protein Meal Plan:");
        for(MealPlan hp: highProteinMeals.getPlan()){
            System.out.println("Meal: " + hp.getMealName());
            System.out.println("Calories: " + hp.getCalories());
        }
    }
}
