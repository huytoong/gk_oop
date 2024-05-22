
import java.util.Scanner;

public class Tritangle extends Polygon{
  public Tritangle(){
    soDinh=3;
    mangCacDinh = new int[3];
  }
    public double tinhDienTich(){
      double p=(mangCacDinh[0]+mangCacDinh[1]+mangCacDinh[2])/2;
      return Math.sqrt(p * (p - mangCacDinh[0]) * (p - mangCacDinh[1]) * (p - mangCacDinh[2]));
    }
    public void Input(){
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<soDinh;i++){
        System.out.println("Nhap canh thu "+(i+1)+": ");
        mangCacDinh[i]=sc.nextInt();
      }
    }
}
