
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puntakarn
 */
public class Teacher extends Person {

    private static Teacher instance = new Teacher();
    private ArrayList<String> teachers;

    private Teacher() {
        type = "teacher";
    }
    
    public static Teacher getInstance(){
      return instance;
    }
    
    @Override
    public void check(String name) {
        teachers.add(name);
    }

    public ArrayList<String> getTeachers() {
        teachers = new ArrayList<String>();
        return teachers;
    }
    
}
