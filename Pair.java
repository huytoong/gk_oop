public class Pair<K,V> {
    private K k;
    private V v;
    public Pair(K k, V v){
        this.k=k;
        this.v=v;
    }
    public K getK(){
      return k;
    }
    public V getV(){
      return v;
    }
    public static void main(String[] args) {
        Pair<Integer,String> vd1 = new Pair<Integer,String>(111, "hello con cec");
        System.err.println(vd1.getK()+" "+vd1.getV());
        IntPair<Integer> vd2 = new IntPair<Integer>(1101, 1234);
        System.err.println(vd2.getK()+" "+vd2.getV());
    }
}
class IntPair<V> extends Pair<Integer,V>{
    public IntPair(Integer k, V v) {
        super(k, v);
    }
}

