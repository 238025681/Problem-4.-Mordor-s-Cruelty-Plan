package Prob3Mankind;


import Prob3Mankind.models.Student;
import Prob3Mankind.models.Worker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kalin
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String input[] = reader.readLine().trim().split("\\s+");
            String studentFirstName = input[0];
            String studentLastName = input[1];
            String facultyNumber = input[2];
            Student student = new Student(studentFirstName, studentLastName, facultyNumber);
            
            input = reader.readLine().trim().split("\\s+");
            String workerFirstName = input[0];
            String workerLastName = input[1];
            double workerSalary = Double.parseDouble(input[2]);
            double workingHours = Double.parseDouble(input[3]);
            Worker worker = new Worker(workerFirstName, workerLastName, workerSalary, workingHours);
            
            System.out.println(student);
            System.out.println(worker);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
