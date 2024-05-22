
import java.util.Scanner;

public class Car extends Vehicle implements Movement{
    private int seatNum;

    public void init(String brand, int speed, int weight, String color){
        super.init(brand, speed, weight, color);
        seatNum=4;
    }
    public void set_SeatNum(){
      System.out.println("Seat_Num: ");
      Scanner sc = new Scanner(System.in);
      seatNum=sc.nextInt();
    }
    public void display(){
      super.display();
      System.out.println("Seat Number: " + seatNum);
    }

    @Override
    public void run(){
      System.out.println("RUN");
    }

    @Override
    public void sleep(){
      System.out.println("SLEEP");
    }

    @Override
    public void start(){
      System.out.println("START");
    }

    @Override
    public void stop(){
      System.out.println("STOPP!!!!");
    }
}
