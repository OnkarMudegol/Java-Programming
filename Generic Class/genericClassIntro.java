//When we are going to know the data type during runtime, we use generic class
//Using this, we can intake take of any type and adapt our methods and functions
//We use T in angle brackets as it is predefined for taing in type (first parameter)
//Similarly S is used in case of taking in two parameter/types where S is predefined as the second parameter
//We can use different var inplace of T butcompiler will take time to figure it out and will also display an error

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