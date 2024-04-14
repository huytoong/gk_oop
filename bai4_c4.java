/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
class NegativeAgeException extends Exception {
    public String getMessage() {
        return "Current year cannot be less than birth year";
    }
}

class Student {
    String name;
    int birthyear;

    public Student() {}

    public Student(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public int getAge(int year) throws NegativeAgeException {
        if (year < birthyear) {
            throw new NegativeAgeException();
        }
        return year - birthyear;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
}

public class bai4_c4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student("John", 2000);
        try {
            System.err.println(student.getAge(2099));
        } catch (NegativeAgeException e) {
            e.printStackTrace();
        }

        try {
            student.setName("tung");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    
}
