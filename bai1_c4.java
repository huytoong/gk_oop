/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai1_c4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai1_c4_pair<String, Integer> pair = new bai1_c4_pair<>("Hello", 123);
        System.out.println("Value of K: " + pair.getK());
        System.out.println("Value of V: " + pair.getV());
        
        
        bai1_c4_IntPair<String> Intpair = new bai1_c4_IntPair<>(123, "Hello");
        System.out.println("Value of K: " + Intpair.getK());
        System.out.println("Value of V: " + Intpair.getV());
    }
    
}
