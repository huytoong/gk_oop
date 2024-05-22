
import java.util.Scanner;



public class Rectangle extends Polygon {
  public double  tinhDienTich(){
    return mangCacDinh[0]*mangCacDinh[1];
  }
  public Rectangle(){
    soDinh=2;
    mangCacDinh= new int[2];
  }
  public void Input(){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<soDinh;i++){
      System.out.println("Nhap canh thu "+(i+1)+": ");
      mangCacDinh[i]=sc.nextInt();
    }
  }
}
