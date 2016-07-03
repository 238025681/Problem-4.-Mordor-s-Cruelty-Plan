/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4MordorsCrueltyPlan.factories;

import Prob4MordorsCrueltyPlan.models.Mood;
import Prob4MordorsCrueltyPlan.models.moods.Angry;
import Prob4MordorsCrueltyPlan.models.moods.Happy;
import Prob4MordorsCrueltyPlan.models.moods.JavaScript;
import Prob4MordorsCrueltyPlan.models.moods.Sad;

public class MoodFactory {

    public static Mood getMood(Integer happinessPoint) {
        if (happinessPoint < -5) {
            return new Angry();
        } else if (happinessPoint >= -5 && happinessPoint < 0) {
            return new Sad();
        } else if (happinessPoint >= 0 && happinessPoint <= 15) {
            return new Happy();
        } else{
            return new JavaScript();
        }

       
    }

}
