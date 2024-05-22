public class Wine extends Beverage{
    private int ABV;
    public Wine(String brand, int abv) {
        super(brand); // Gọi constructor của lớp trừu tượng
        this.ABV = abv;
    }
    public void display(){
      System.out.println("BRAND: "+Brand);
      System.out.println("ABV: "+ABV);
    }
}
