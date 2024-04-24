//Not passing type during the creation of the object, we pass the type of the object only when we are passing the values.
public class genericClassTypeInference{
    public static void main(String arg[]){
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        stringBox.add("Hello World!!");

        System.out.println("Integer value: "+integerBox.get());
        System.out.println("String value: "+stringBox.get());
    }
}
class Box<T>{
    private T t;
    public void add(T t){
        this.t =t;
    }
    public T get(){
        return t;
    }
}