
package program2c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Program2C program = new Program2C();
     
         List<Student> students = new ArrayList<>();
       
      DataProvider.generateStudent();
       students = DataProvider.students;
        program.displayStudent(students);
              
         students.add(program.inputStudent());
         program.displayStudent(students);
        
    }
    public void displayStudent( List<Student> students){
           for (Student student1 : students) {
            System.out.println("First Name: " + student1.getFirstName());  
         }
    }
    public Student inputStudent(){
         Scanner sc = new Scanner(System.in);
          String fname,lname;
          System.out.println("Please provide Information ");
         System.out.print("First Name: ");
         fname = sc.nextLine();
          System.out.print("Last Name: ");
          lname = sc.nextLine();
          return new Student(fname, lname);
    }
}
