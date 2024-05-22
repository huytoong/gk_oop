public class NegativeAgeException extends Exception{
    public String getMessage(){
      return "Current year can not be les than birthyear";
    }
    public void printERR(){
      System.err.println(getMessage());
    }
    public static void main(String[] args) {
        Student vd1 = new Student(null, 2205);
        try{
            System.err.println(vd1.getAge(2006));
        }
        catch(NegativeAgeException e){
          e.printERR();
        }
        finally{
          System.err.println("OK AGE");
        }

        try {
            vd1.setName("tung");
        } catch (IllegalArgumentException e) {
          e.printStackTrace();
        }
        finally{
          System.err.println(vd1.getName());
          System.err.println("OK NAME");

        }
    }
}
class Student {
  String name;
  int birthyear;
  public Student(){

  }
  public Student(String name, int birthyear){
    this.name=name;
    this.birthyear=birthyear;
  }
  public int getAge(int year) throws NegativeAgeException{
    if(year<birthyear) throw new NegativeAgeException();
    return year-birthyear;
  }
  
  public void setName(String name){
    if(name==null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
    this.name=name;
  }
  public String getName(){
    return name;
  }
}
