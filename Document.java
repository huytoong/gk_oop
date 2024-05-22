public abstract class Document {
    String title;
    int page;
    String size;
    public Document(String title, int page, String size){
      this.title=title;
      this.page=page;
      this.size=size;
    }
    public abstract void print();

}
