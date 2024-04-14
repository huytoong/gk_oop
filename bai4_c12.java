/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai4_c12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap so mon hoc: ");
        int n=sc.nextInt();
        bai4_c12_Subject [] vd = new bai4_c12_Subject[n];
        for(int i=0;i<n;i++){
            vd[i] = new bai4_c12_Subject();
        }
        for(bai4_c12_Subject x: vd){
            x.Nhap();
        }
        for(bai4_c12_Subject x: vd){
            System.err.print(bai4_c12_ConvertTool.NormalToFour(x.diem)+" ");
        }
        System.err.println("");
        System.err.println("Tot Nghiep: "+bai4_c12_ConvertTool.Grade(vd));
    }
    
}
