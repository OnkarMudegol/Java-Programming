class Box<T, S> {
    private T t;
    private S s;
    public void add(T t, S s){
        this.t = t;
        this.s = s;
    }
    public T getFirst(){
        return t;
    }
    public S getSecond(){
        return s;
    }
}
public class genericClassTwoParameters{
    public static void main(String arg[]){
        Box<Integer, String> box1 = new Box<Integer, String>();
        box1.add(10,"Hello, World!");
        System.out.println("Integer value : "+box1.getFirst());
        System.out.println("String value : "+box1.getSecond());

        Box<String, String> box2 = new Box<String, String>();
        box2.add("Hello Java!","Hello, World!");
        System.out.println("First String value : "+box2.getFirst());
        System.out.println("Second String value : "+box2.getSecond());
    }
}