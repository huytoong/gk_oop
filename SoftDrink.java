public class SoftDrink extends Beverage{
    private int Sugar;
    public SoftDrink(String Brand, int Sugar){
        super(Brand);
        this.Sugar=Sugar;
    }
    public void display(){
      System.out.println("BRAND: "+Brand);
      System.out.println("SUGAR: "+Sugar);
    }
}
