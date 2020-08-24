
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puntakarn
 */
public class Main {
    public static void main(String[] args) {
        
        Student s = Student.getInstance();
        Teacher t = Teacher.getInstance();
        
        ArrayList<String> std = s.getStudents();
        ArrayList<String> tea = t.getTeachers();

        String numberType;
        while (true){
            System.out.println("\nCheck Student( 1 ) || Check Teacher( 2 ) || Checklist( 3 ) || Reset( 0 ) || Close( . )");
            Scanner myObj = new Scanner(System.in);
            numberType = myObj.nextLine();
            if(numberType.equals("1")){
                System.out.println("\nPlease enter your name: ");
                Scanner Obj = new Scanner(System.in);
                String name = Obj.nextLine();
                if (name.equals("."))
                    break;
                s.check(name);
                System.out.println("\n------- Students List -------");
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
                t.check(name);
                System.out.println("\n------- Teachers List -------");
                for (int i = 0; i < tea.size(); i++) {
                    System.out.println((i+1)+". "+tea.get(i));
                }
            }
            else if(numberType.equals(".")){
                break;
            }
            else if(numberType.equals("0")){
                s = (Student) s.clone();
                t = (Teacher) t.clone();
                std = s.getStudents();
                tea = t.getTeachers();
                System.out.println("Reset is complete.");
            }
            else if(numberType.equals("3")){
                System.out.println("\n------- Students List -------");
                for (int i = 0; i < std.size(); i++) {
                    System.out.println((i+1)+". "+std.get(i));
                }
                System.out.println("\n------- Teachers List -------");
                for (int i = 0; i < tea.size(); i++) {
                    System.out.println((i+1)+". "+tea.get(i));
                }
            }
            else{
                continue;
            }
        }
    }
}
