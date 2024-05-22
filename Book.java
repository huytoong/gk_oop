public class Book extends Document{
    String author;
    public Book(String title, int page, String size, String author){
      super(title,page,size);
      this.author=author;
    }
    @Override
    public void print(){
        System.out.println("print the book");
    }
}
