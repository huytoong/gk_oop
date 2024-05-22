public class Main_Beverage {
  public static void main(String[] args) {
      Beverage drink = new Wine("Volka",30);
      Bottle vd1 = new Bottle(drink,350);
      vd1.Show();
      drink = new SoftDrink("COCA",12);
      vd1 = new Bottle(drink,250);
      vd1.Show();
  }
}
