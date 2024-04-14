/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai3_c12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai3_c12_Department vd= new bai3_c12_Department(10);
        for(int i=0;i<vd.getNum();i++){
            bai3_c12_Employee e = new bai3_c12_Employee();
            vd.addEmployee(e);
        }
        vd.display();
    }
    
}
