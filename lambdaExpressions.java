//These tags are used to give information to the compiler. No required but advised.
@FunctionalInterface
//No memeory is allocated to the object as no new object is being created. 
//Rather than allocating memory to the entire class we allocate memory to the particular function

//No argument lambda expression
// interface Sayable
// {
//     public String say();
// }
// public class lambdaExpressions
// {
//     public static void main(String args[])
//     {
//         Sayable s = ()->{
//             return "I have nothing to say.";
//         };
//         System.out.println(s.say());
//     }
// }

//One argument lambda expression
// interface Sayable
// {
//     public String say(String name);
// }
// public class lambdaExpressions
// {
//     public static void main(String args[])
//     {
//         Sayable s1 = (name)->{
//             return "Hello, "+name;
//         };
//         System.out.println(s1.say("abc"));
//         Sayable s2 = (name)->{
//             return "Hello, My name is "+name;
//         };
//         System.out.println(s2.say("def"));
//     }
// }

//Multiple argumnet lambda expression
interface Addable
{
    int add(int a, int b);
}
public class lambdaExpressions
{
    public static void main(String args[])
    {
        Addable ad1 = (a,b)->(a+b);
        System.out.println(ad1.add(10,20));
        Addable ad2 = (a,b)->(a*b);
        System.out.println(ad2.add(100,200));
    }
}