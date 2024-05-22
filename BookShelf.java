import java.util.ArrayList;
import java.util.List;

public class BookShelf<T extends Document>{
      List<T> items;
      int num;
      public BookShelf(){
        items=new ArrayList<T>();
      }
      public void putItems(T t){
        //TODO: thêm đối tượng t và danh sách item
        items.add(t);
        num++;
      }
      public T getItemByTitle(String title){
          for(T t: items){
            if(t.title==title){
                return t;
            }
          }
          return null;
      }
      public static void main(String[] args) {
          BookShelf<Document> Shelf = new BookShelf<>();
          Book b1 = new Book("giai tich", 100, "L", "thoan tran");
          Magazine m1 = new Magazine("SKATE_Street", 50, "XL", "ĐANHZ_MGZ");
          Shelf.putItems(m1);
          Shelf.putItems(b1);
          System.err.println(Shelf.getItemByTitle("SKATE_Street").title);
      }
}
interface ITF{ //thực hiện cho các lớp dãn xuất của document, thêm &ITF vào bookshefl
    public void sayhello();
}
