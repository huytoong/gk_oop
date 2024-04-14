package tgk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai5_c12_Subject {
    float diem;
    int SoTinChi;

    bai5_c12_Subject() {
        diem=0;
        SoTinChi=0;
    }

    public bai5_c12_Subject(float diem, int SoTinChi) {
        this.diem = diem;
        this.SoTinChi = SoTinChi;
    }
    
    public void Nhap(){
        System.err.println("Nhap diem: ");
        Scanner sc = new Scanner(System.in);
        diem=sc.nextFloat();
        System.err.println("Nhap so tin chi: ");
        SoTinChi=sc.nextInt();
        System.err.println("--------------------");
    }
    
    
}