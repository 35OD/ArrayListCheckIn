import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {


//
//1. Create an ArrayList to store names of students.
//            2. Add at least five names to the list.
//            3. Print the list of names.
//4. Remove a name and print the updated list.
//            5. Sort the list alphabetically and print the sorted list.
ArrayList<String> students = new ArrayList<>();

    public void addStudent(String student){
        try{
            students.add(student);
            System.out.println("Added student: " + student);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayStudent(){
        System.out.println("List of employees: ");
        try{
            for(String student : students){
                System.out.println(student);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void removeStudent(String student){
        try{
            students.remove(student);
            System.out.println("Removed student: " + student);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortStudent(){
        Collections.sort(students);
        System.out.println("Sorted students: " + students);
    }
}
