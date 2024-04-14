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
public class bai1_c3_Officer extends bai1_c3_Citizen{
    private String department;
    private String position;
    
    public bai1_c3_Officer(){
        super();
        department=null;
        position=null;
                
    }
    
    public bai1_c3_Officer(String name, String birthday, String address, String idCardNum,String department, String position){
        super(name, birthday, address, idCardNum);
        this.department=department;
        this.position=position;
    }
    
    public void nhap(){
        super.nhap();
        System.err.println("department: ");
        Scanner sc = new Scanner(System.in);
        department=sc.nextLine();
        System.err.println("position: ");
        position=sc.nextLine();
    }
    
    public void display(){
        super.display();
        System.err.println("department: "+department);
        System.err.println("positon: "+position);
    }
}
