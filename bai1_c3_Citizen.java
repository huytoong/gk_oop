/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1_c3_Citizen {
    protected String name;
    protected String birthday;
    protected String address;
    protected String IDcard;

    public bai1_c3_Citizen() {
        name="nguyen van A";
        birthday="10/10/2010";
        address = "Viet Nam";
        IDcard = "00000001";
    }

    public bai1_c3_Citizen(String name, String birthday, String address, String IDcard) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.IDcard = IDcard;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.err.println("name: ");
        name=sc.nextLine();
        System.err.println("birthday: ");
        birthday=sc.next();
        sc.nextLine();  // consume newline left-over
        System.err.println("address: ");
        address = sc.nextLine();
        System.err.println("IDcard: ");
        IDcard = sc.next();
        sc.nextLine();         
    }
    
    public void display(){
        System.err.println("name: "+name);
        System.err.println("birthday: "+birthday);
        System.err.println("address: "+address);
        System.err.println("IDcard: "+IDcard);
    }
    
}
