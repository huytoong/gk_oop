/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai2_c3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai2_c3_Vehicle vehicle = new bai2_c3_Vehicle();
        vehicle.init();
        vehicle.display();
        bai2_c3_Car car = new bai2_c3_Car();
        car.init();
        car.display();
        car.run();
        car.start();
        car.sleep();
        car.stop();
//        vehicle = new bai2_c3_Car();
//        vehicle.init();
//        vehicle.display();
        
    }
    
}
