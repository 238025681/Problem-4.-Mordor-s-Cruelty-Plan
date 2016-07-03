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
public class Lembas extends Food {

    private String name;
    private Integer pointOfHappiness;

    public Lembas(String name) {
        this.name = name;
        this.pointOfHappiness = 3;
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
