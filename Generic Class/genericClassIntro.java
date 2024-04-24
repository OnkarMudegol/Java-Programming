//When we are going to know the data type during runtime, we use generic class. Generic class is mainly used in dynamic programming.
//Using this, we can intake any type and adapt our methods and functions to that type.
//We use T in angle brackets as it is predefined for taing in the type (first parameter)
//Similarly S is used in case of taking in second parameter/type 
//We can use different variables inplace of T but compiler will take time to figure it out and will also display an warning

class Box<T> {
    private T object;
    public void setObject(T object){
        this.object = object;
    }
    public T getObject(){
        return object;
    }
}
public class genericClassIntro{
    public static void main(String arg[]){
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Hello, World!");
        String str = stringBox.getObject();
        System.out.println("String box value: "+str);
        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(42);
        int i= integerBox.getObject();
        System.out.println("Integer box value: "+i);
    }
}