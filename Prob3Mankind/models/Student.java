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
public class Student extends Human{
    private String facultyNumber;

    

    public Student(String firsName, String lastName, String facultyNumber) {
        super(firsName, lastName);
        this.setFacultyNumber(facultyNumber);
    }
    

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10 ) {
            throw  new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nFaculty number: %s", this.firsName, this.lastName, this.facultyNumber);
  
    }
    
    
    
}
