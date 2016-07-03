package Prob1Person.models;

public class Child extends Person {

   public Child(String name, Integer age){
    super(name, age);
}
   @Override
 protected void setAge(int age) {
        if (age >= 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
     
        this.age = age;
    }

}
