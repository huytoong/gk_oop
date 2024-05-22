
import java.util.Scanner;

public abstract class Polygon {
    int soDinh;
    int [] mangCacDinh = null;
    double dienTich;
    public Polygon(){
      soDinh=0;
      mangCacDinh = null;
      dienTich=0;
    }
    public void Input(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap so dinh: ");
      soDinh=sc.nextInt();
      for(int i=0;i<soDinh;i++){
        System.out.println("Nhap do dai canh thu "+i+1+": ");
        mangCacDinh[i]=sc.nextInt();
      }
    }
    public void printt(){
      System.err.println("--------DANH SACH DINH------");
      for(int i=0;i<soDinh;i++){
        System.out.println("Do dai canh thu "+(i+1)+": "+mangCacDinh[i]);
      }
    }
    public abstract double  tinhDienTich();
    public static void main(String[] args) {
        Polygon shape = new Rectangle();
        shape.Input();
        System.err.println(shape.tinhDienTich());
        shape = new Tritangle();
        shape.Input();
        System.err.println(shape.tinhDienTich());
    }
}
