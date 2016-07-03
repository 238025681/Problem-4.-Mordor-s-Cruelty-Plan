/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3Mankind.models;

/**
 *
 * @author kalin
 */
public class Human {
    protected String firsName;
    protected String lastName;

    public Human(String firsName, String lastName) {
        this.setFirsName(firsName);
        this.setLastName(lastName);
    }

    private void setFirsName(String firsName) {
        if (!Character.isUpperCase(firsName.charAt(0))) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        if (firsName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firsName = firsName;
    }

    protected void setLastName(String lastName) {
         if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }
    
    
    
}
