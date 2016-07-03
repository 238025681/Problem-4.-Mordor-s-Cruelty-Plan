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
public class Cram extends Food {

    private String name;
    private Integer pointOfHappiness;

    public Cram(String name) {
        this.name = name;
        this.pointOfHappiness = 2;
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
