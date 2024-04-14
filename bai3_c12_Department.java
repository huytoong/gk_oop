/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai3_c12_Department {
    private String name;
    private bai3_c12_Employee arrE[];
    private int num;

    public bai3_c12_Department(int n) {
        arrE = new bai3_c12_Employee[n];
        num=0;
    }
    public void addEmployee(bai3_c12_Employee e){
        arrE[num]=e;
        num++;
    }
    public void display(){
        for(bai3_c12_Employee x: arrE){
            x.display();
            System.err.println("------------------");
        }
    }
    public int getNum(){
        return num;
    }
    
}
