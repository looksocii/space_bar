
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB304-53
 */
public abstract class Person implements Cloneable {
    
    abstract void addStudent(String name);
    abstract void addTeacher(String name);
    abstract ArrayList<String> getStudents();
    abstract ArrayList<String> getTeachers();
    
    public Object clone() {
      Object clone = null;
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}
