
package Prob4MordorsCrueltyPlan;

import Prob4MordorsCrueltyPlan.models.Gandalf;
import Prob4MordorsCrueltyPlan.models.Food;
import Prob4MordorsCrueltyPlan.factories.FoodFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kalin
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String[] food = reader.readLine().split("\\s+");
            Gandalf gandalf = new Gandalf();
            gandalf.setFoods(food);
            gandalf.setMood();
            System.out.println(gandalf);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
