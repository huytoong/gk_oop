import java.lang.*;
public class Group<T> {
    T items[];// mảng lưu các phần tử trong nhóm
    int num;// số phần tử hiện tại trong nhóm
    // @SuppressWarnings("unchecked")
    public Group(Class<T> dataType, int length){
        this.items = (T[]) 
        java.lang.reflect.Array.newInstance(dataType, length);
    }
    public void addItem(T t){
        //TODO: thêm phần tử t vào nhóm
        if(num<items.length){
            items[num]=t;
            num++;
        }
        else{
            System.out.println("Group is full");
        }
    }
    public T getItem(int index){
        //TODO: lấy phần tử thứ index từ nhóm
        if(index<=0 || index>num){
            System.out.println("invalid");
            return null;
        }
        return items[index-1];
    }
    public int getNumberItems(){
    //TODO: trả về số phần tử trong nhóm}
        return num;
    }
    public static void main(String[] args) {
        Group<String> vd1 = new Group<>(String.class, 10);
        vd1.addItem("tung");
        vd1.addItem("huy");
        System.err.println( vd1.getNumberItems());
        System.err.println( vd1.getItem(2));
        System.err.println("---------------------");
        Group<Integer> vd2 = new Group<>(Integer.class,5);
        vd2.addItem(200);
        vd2.addItem(1999);
        vd2.addItem(99999);
        System.err.println(vd2.getNumberItems());
        System.err.println(vd2.getItem(2));
    }
}