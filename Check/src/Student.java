
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB304-53
 */
public class Student extends Person{
    
    private static Student instance = new Student();
    private ArrayList<String> students;
    
    private Student(){
        type = "teacher";
    }
    
    public static Student getInstance(){
      return instance;
    }
    
    @Override
    public void check(String name) {
        students.add(name);
    }

    public ArrayList<String> getStudents() {
        students = new ArrayList<String>();
        return students;
    }
    
}
