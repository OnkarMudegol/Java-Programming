//Here first T is acting as the return type and second is acting as the input type
class GenericClass<X>{
    <T>GenericClass(T t){
        System.out.println(t);
    }
}
public class genericConstructor{
    public static void main(String arg[]){
        GenericClass<String> obj = new GenericClass<String>("Hello");
    }
}