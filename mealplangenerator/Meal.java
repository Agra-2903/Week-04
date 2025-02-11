package org.example.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> mealPlan = new ArrayList<>();

    public void addMeal(T meal) {
        mealPlan.add(meal);
    }

    public List<? extends MealPlan> getPlan(){
        return mealPlan;
    }
}
