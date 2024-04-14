/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai3_c12_Employee {
    private String name;
    private long phone;
    private String address;

    public bai3_c12_Employee() {
        name="nguyen van A";
        phone=123456789;
        address="Viet Nam";
    }
    
    public void bai3_c12_Employee(String name, long phone, String address){
        this.name=name;
        this.phone=phone;
        this.address=address;
    }
    
    public void display(){
        System.err.println("Name: "+name);
        System.err.println("Phone: "+phone);
        System.err.println("Address: "+address);
    }
    
    
}
