package util;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {


//
//1. Create an ArrayList to store names of students.
//            2. Add at least five names to the list.
//            3. Print the list of names.
//4. Remove a name and print the updated list.
//            5. Sort the list alphabetically and print the sorted list.
private ArrayList<String> students = new ArrayList<>();

  public void arrayOfStudents(){
      students.add("Jane");
      students.add("John");
      students.add("Missy");
      students.add("Luis");
      students.add("Ray");
      System.out.println("List of students: " + students);

      students.remove("Ray");
      System.out.println("List of students after remove: " + students);

      System.out.println("Students before sort: ");
      Collections.sort(students);
      System.out.println("List of students: " + students);
  }

}
