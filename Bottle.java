public class Bottle {
  private float Volume;
  private Beverage beverage;
  public Bottle(){

  }
  public Bottle(Beverage beverage,float Volume){
      this.beverage=beverage;
      this.Volume=Volume;
  }
  public void Show(){
    beverage.display();
    System.out.println("VOLUME: "+Volume);
  }
}
