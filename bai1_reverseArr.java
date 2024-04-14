/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;
import java.util.*;
/**
 *
 * @author Admin
 */
public class bai1_reverseArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap so ptu: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1;i<=n;i++) {
            System.err.println("Nhap ptu thu "+i+": ");
            int tmp=sc.nextInt();
            arr.add(tmp);
        }
        for(int i=0;i<arr.size()/2;i++){
            int tmp;
            tmp=arr.get(i);
            arr.set(i,arr.get(arr.size()-i-1));
            arr.set(arr.size()-i-1, tmp);
        }
        
        System.err.println("Mang sau khi reverse: ");
        for(Integer x: arr){
            System.err.print(x+ " ");
        }
        
    }
    
}
