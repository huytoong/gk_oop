/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
public class bai5_c12_ConvertTool {
    public static final float minGrade=2f;
    public static float NormalToFour(float d){
        if(d>=8.5) return 4;
        else if(d>=7) return 3;
        else if(d>=5.5) return 2;
        else if(d>=4) return 1;
        return 0;
    }
    
    public static String FourToABCDF(float d){
        if(d>=8.5) return "A";
        else if(d>=7) return "B";
        else if(d>=5.5) return "C";
        else if(d>=4) return "D";
        return "F";
    }
    
    public static boolean Grade(bai5_c12_Subject subs[]){
        float tmp = 0;
        int tongSoTin=0;
        for(bai5_c12_Subject x: subs){
            tmp+=NormalToFour(x.diem)*x.SoTinChi;
            tongSoTin+=x.SoTinChi;
        }
        tmp=tmp/tongSoTin;
        if(tmp>=minGrade) return true;
        return false;
    }
}
