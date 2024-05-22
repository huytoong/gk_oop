
    class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }
    class Dog extends Animal{
        void sound(){
            System.out.println("gau gau");
        }
        void trongNha(){
          System.out.println("Chó trông nhà");
        }
    }
public class link_static_dynamic {
    public static void main(String[] args) {
        Animal ex = new Dog();
        ex.sound(); 
        ((Dog)ex).trongNha();
    }  
}
