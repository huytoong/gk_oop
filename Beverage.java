public abstract  class Beverage {
    String Brand;
    public Beverage(){
      Brand="ABC";
    }
    public Beverage(String Brand){
        this.Brand=Brand;
    }
    abstract public void display();
}
