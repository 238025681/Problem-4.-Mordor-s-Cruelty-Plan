package Prob4MordorsCrueltyPlan.models;

import Prob4MordorsCrueltyPlan.factories.FoodFactory;
import Prob4MordorsCrueltyPlan.factories.MoodFactory;
import java.util.ArrayList;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Gandalf {

    private final Integer DEFAULT_HAPPINESS_POINT = 0;

    private Integer happinessPoin;
    private ArrayList<Food> foods;
    private Mood mood;

    public Gandalf() {
        this.happinessPoin = DEFAULT_HAPPINESS_POINT;
        this.foods = new ArrayList<>();
        this.setMood();
    }

    public Integer getHappinessPoin() {
        return happinessPoin;
    }

    private void setHappinessPoin() {
        for (Food food : foods) {
            this.happinessPoin += food.getPointOfHappiness();
        }
    }

    public void setMood() {
        mood = MoodFactory.getMood(this.happinessPoin);
    }

    public void setFoods(String... foods) {
        for (String food : foods) {
            this.foods.add(FoodFactory.getFood(food));
        }
        if (foods.length >= 1) {
            setHappinessPoin();
        }
            
       
    }

    @Override
    public String toString() {
        return String.format("%d%n%s", this.happinessPoin, this.mood);
    }
    

}
