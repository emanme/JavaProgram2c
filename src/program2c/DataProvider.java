 
package program2c;
import java.util.List;
import java.util.ArrayList;
 

public class DataProvider {
    public static  List<Student> students = new ArrayList<>();
 public static void  generateStudent(){
 
     students.add(new Student("John", "Doe", "A", "123 Main St", "Class A"));
     students.add(new Student("Alice", "Smith", "B", "456 Elm St", "Class B"));
     students.add(new Student("Bob", "Johnson", "C", "789 Oak St", "Class A"));
     students.add(new Student("Eva", "Williams", "D", "101 Pine St", "Class C"));
     students.add(new Student("Michael", "Brown", "E", "222 Cedar St", "Class B"));
     
      
 }  
    
}