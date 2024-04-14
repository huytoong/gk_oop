/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai2_c12_Person {
    private String name;
    private int age;
    private String address;
    private static int CountPerson=0;
    bai2_c12_Person(){
        name="nguyen van A";
        age=0;
        CountPerson++;
    }

    bai2_c12_Person(String name, int age) {
        this.name = name;
        this.age = age;
        CountPerson++;
    }

    public bai2_c12_Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        CountPerson++;
    }
    
    public int getCount(){
        return CountPerson;
    }
    
    void display(){
        System.err.println("Name: "+name);
        System.err.println("Age: "+age);
        System.err.println("Address: "+address);
    }
}
