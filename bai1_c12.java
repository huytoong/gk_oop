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
public class bai1_c12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.err.println("Gia tri vua nhap: "+n);
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            System.err.println("Nhap ptu thu "+i+": ");
            a[i]=sc.nextInt();
        }
        System.err.println("Mang vua nhap: ");
        for(int x:a){
            System.out.print(x+" ");
        }
        int b[][]= new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<n;j++){
            int tmp=0;
            for(int i=0;i<n;i++){
                tmp+=b[i][j];
            }
            System.err.println("TBC cot "+j+": "+(double)tmp/n);
        }
        System.err.println("Nhap xau T");
        String T=sc.next();
        System.err.println("Nhap xau S");
        String S=sc.next();
        System.err.println("Tong do dai 2 xau S va T: "+(S.length()+T.length()));
        System.err.println(T.indexOf(S));
    }
    
}
