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
public class bai5_c12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap so SV: ");
        int n=sc.nextInt();
        bai5_c12_Student vd[]= new bai5_c12_Student [n];
        for(int i=0;i<n;i++){
            vd[i]=new bai5_c12_Student();
            vd[i].init();
        }
        System.err.println("------KQ HOC TAP---------");
        System.err.println("STT |      hoten           |  DTB  |  TN ");
        for(int i=0;i<n;i++){
            System.err.println(i+1+" "+vd[i].getName()+"    "+vd[i].TinhDTB(vd[i].diemCacMon)+"  "+bai5_c12_ConvertTool.Grade(vd[i].diemCacMon));
        }
    }
    
}
