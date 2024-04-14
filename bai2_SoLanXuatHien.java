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
class pair{
    public int first,second;
    public pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
public class bai2_SoLanXuatHien {

    /**
     * @param args the command line arguments
     */
    private int n;
    private ArrayList<Integer> Arr = new ArrayList<>();  
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap so ptu: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.err.println("Nhap ptu thu "+i+": ");
            int tmp=sc.nextInt();
            Arr.add(tmp);
        }
    }
    public void PrintArr(){
        System.err.println("printArr: ");
        for(int x: Arr){
            System.err.print(x+" ");
        }
    }
    public pair FindMax(){
        Map<Integer,Integer> mp = new HashMap<>();
        for(Integer x: Arr){
            if (!mp.containsKey(x)) {
                mp.put(x, 1);
            } else {
                mp.put(x, mp.get(x) + 1);
            }
        }
        int key=-1, val=-1;
        for(Map.Entry<Integer,Integer> x: mp.entrySet()){
            if(x.getValue()>val){
                key=x.getKey();
                val=x.getValue();
            }
        }
        return new pair(key,val);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        bai2_SoLanXuatHien vd = new bai2_SoLanXuatHien();
        vd.Nhap();
        vd.PrintArr();
        pair tmp = vd.FindMax();
        System.err.println("");
        System.err.println(tmp.first+" co so lan xuat hien: "+tmp.second);
    }
    
}
