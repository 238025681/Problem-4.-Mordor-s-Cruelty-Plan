/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4MordorsCrueltyPlan.models.food;

import Prob4MordorsCrueltyPlan.models.Food;
import Prob4MordorsCrueltyPlan.models.Gandalf;

/**
 *
 * @author kalin
 */
public class Melon extends Food {

    private String name;
    private Integer pointOfHappiness;

    public Melon(String name) {
        this.name = name;
        this.pointOfHappiness = 1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPointOfHappiness() {
        return this.pointOfHappiness;
    }

}
