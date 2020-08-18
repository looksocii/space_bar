
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
public class Student {
    private static Student instance = new Student();
    private ArrayList<String> students = new ArrayList<String>();
    private ArrayList<String> teacher = new ArrayList<String>();

    private Student() {}
    
    public static Student getInstance(){
      return instance;
   }
    
    public void addStudent(String name) {
        students.add(name);
    }
    public ArrayList<String> getStudents() {
        return students;
    }
    public void addTeacher(String name) {
        teacher.add(name);
    }
    public ArrayList<String> getTeachers() {
        return teacher;
    }
    
    public static void main(String[] args) {
        
        Student namesList = Student.getInstance();
        
        ArrayList<String> std = namesList.getStudents();
        ArrayList<String> tea = namesList.getTeachers();
        String numberType;
        while (true){
            System.out.println("\nStudent(1) or Teacher(2) or Close ( . )");
            Scanner myObj = new Scanner(System.in);
            numberType = myObj.nextLine();
            if(numberType.equals("1")){
                System.out.println("\nPlease enter your name: ");
                Scanner Obj = new Scanner(System.in);
                String name = Obj.nextLine();
                if (name.equals("."))
                    break;
                namesList.addStudent(name);
                System.out.println("------- Students List -------");
                for (int i = 0; i < std.size(); i++) {
                    System.out.println((i+1)+". "+std.get(i));
                }
            }
            else if(numberType.equals("2")){
                System.out.println("\nPlease enter your name: ");
                Scanner Obj = new Scanner(System.in);
                String name = Obj.nextLine();
                if (name.equals("."))
                    break;
                namesList.addTeacher(name);
                System.out.println("------- Teachers List -------");
                for (int i = 0; i < tea.size(); i++) {
                    System.out.println((i+1)+". "+tea.get(i));
                }
            }
            else if(numberType.equals(".")){
                break;
            }
            else{
                continue;
            }
        }
    }
}
