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
public class bai2_c3_Car extends bai2_c3_Vehicle implements bai2_c3_Movement{
    private int seatNum;

    public bai2_c3_Car() {
    
    }
    
    public void init(){
        super.init();
        Scanner sc = new Scanner(System.in);
        System.err.println("SeatNum: ");
        seatNum=sc.nextInt();
    }
    
    public void display(){
        super.display();
        System.err.println("SeatNum: "+seatNum);
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void sleep() {
        System.out.println("Car is sleeping");
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
