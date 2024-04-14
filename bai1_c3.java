/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai1_c3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai1_c3_Citizen citizen = new bai1_c3_Citizen();
        citizen.nhap();
        citizen.display();

        bai1_c3_Officer officer = new bai1_c3_Officer();
        officer.nhap();
        officer.display();
    }
    
}
