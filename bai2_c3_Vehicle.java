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
public class bai2_c3_Vehicle{
    private String brand;
    private String color;
    private int speed;
    private int weight;

    public bai2_c3_Vehicle() {
        
    }
    
    public void init(){
        Scanner sc =new Scanner(System.in);
        System.err.println("Brand: ");
        brand=sc.next();
        System.err.println("Speed: ");
        speed=sc.nextInt();
        System.err.println("Weight: ");
        weight=sc.nextInt();
        System.err.println("Color: ");
        sc.nextLine();
        color=sc.nextLine();
    }
    
    public void display(){
        System.err.println("Brand: "+brand);
        System.err.println("Speed: "+speed);
        System.err.println("Weight: "+weight);
        System.err.println("Color: "+color);
        
    }
    
}
