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
public class bai5_c12_Student {
    private String name;
    private int SoMon;
    public bai5_c12_Subject [] diemCacMon;
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.err.println("-----------Nhap thong tin SV----------");
        System.err.println("Name: ");
        name = sc.nextLine();
        System.err.println("So Mon: ");
        SoMon = sc.nextInt();
        diemCacMon = new bai5_c12_Subject[SoMon];
        for(int i=0;i<SoMon;i++){
            diemCacMon[i] = new bai5_c12_Subject();
            diemCacMon[i].Nhap();
        }
    }
    
    public float TinhDTB(bai5_c12_Subject vd[]){
        float ans=0;
        for(bai5_c12_Subject x: vd){
            ans+=bai5_c12_ConvertTool.NormalToFour(x.diem);
        }
        ans/=SoMon;
        return ans;
    }
        
    public String getName(){
        return name;
    }
}
