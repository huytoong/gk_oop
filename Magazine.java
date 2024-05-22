public class Magazine extends Document{
    String publisher;
    public Magazine(String title, int page, String size, String publisher){
      super(title,page,size);
      this.publisher=publisher;
    }
    @Override
    public void print() {
        System.out.println("print the magazine");
    }
}
