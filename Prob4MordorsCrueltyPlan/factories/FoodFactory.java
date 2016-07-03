/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4MordorsCrueltyPlan.factories;

import Prob4MordorsCrueltyPlan.models.Food;
import Prob4MordorsCrueltyPlan.models.food.Apple;
import Prob4MordorsCrueltyPlan.models.food.Cram;
import Prob4MordorsCrueltyPlan.models.food.HoneyCake;
import Prob4MordorsCrueltyPlan.models.food.Lembas;
import Prob4MordorsCrueltyPlan.models.food.Melon;
import Prob4MordorsCrueltyPlan.models.food.Mushrooms;
import Prob4MordorsCrueltyPlan.models.food.UnknownFood;

/**
 *
 * @author kalin
 */
public class FoodFactory {

    public static Food getFood(String name) {
        String food = name.toLowerCase();
        switch (food) {
            case "cram":
                return new Cram(food);
            case "apple":
                return new Apple(food);
            case "lembas":
                return new Lembas(food);
            case "melon":
                return new Melon(food);
            case "honeycake":
                return new HoneyCake(food);
            case "mushrooms":
                return new Mushrooms(food);
            default:
                return new UnknownFood(food);

        }
    }

}
