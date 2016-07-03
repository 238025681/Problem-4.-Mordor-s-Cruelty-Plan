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
public class Worker extends Human {

    private double salary;
    private double workHour;
    private double salaryPerHour;

    public Worker(String firsName, String lastName, double salary, double workHour) {
        super(firsName, lastName);
        this.setSalary(salary);
        this.setWorkHour(workHour);
        calculateSalaryPerHour();
    }

    private void setSalary(double salary) {
        if (salary <= 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    private void setWorkHour(double workHour) {
        if (workHour < 1 || workHour > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHour = workHour;
    }
    private void calculateSalaryPerHour(){
        
      this.salaryPerHour = (this.salary / 7) / this.workHour;
    }
@Override
protected void setLastName(String lastName){
     if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
}
   

    @Override
    public String toString() {
        return  String.format("First Name: %s%nLast Name: %s%nWeek Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f", 
                this.firsName, this.lastName, this.salary, this.workHour, this.salaryPerHour);
                
    }

}
