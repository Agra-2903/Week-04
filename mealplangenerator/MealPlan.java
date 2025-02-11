package org.example.mealplangenerator;

public interface MealPlan {
    String getMealName();
    int getCalories();
}

class VegetarianMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VegetarianMeal(String name, int calories) {
        this.mealName = name;
        this.calories = calories;
    }

    public String getMealName() {
        return mealName;
    }

    public int getCalories() {
        return calories;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VeganMeal(String name, int calories) {
        this.mealName = name;
        this.calories = calories;
    }

    public String getMealName() {
        return mealName;
    }

    public int getCalories() {
        return calories;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;
    private int calories;

    public KetoMeal(String name, int calories) {
        this.mealName = name;
        this.calories = calories;
    }

    public String getMealName() {
        return mealName;
    }

    public int getCalories() {
        return calories;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;
    private int calories;

    public HighProteinMeal(String name, int calories) {
        this.mealName = name;
        this.calories = calories;
    }

    public String getMealName() {
        return mealName;
    }

    public int getCalories() {
        return calories;
    }
}
