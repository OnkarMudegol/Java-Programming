//These tags are used to give information to the compiler. No required but advised.
@FunctionalInterface
//No memeory is allocated to the object as no new object is being created. 
//Rather than allocating memory to the entire class we allocate memory to the particular function

//No argument lambda expression
// interface Sayable
// {
//     public String say();
// }
// public class lambdaExpression_Intro
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
// public class lambdaExpression_Intro
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
//We can write a lambda expression with or without return statement
interface Addable
{
    int add(int a, int b);
}
public class lambdaExpression_Intro
{
    public static void main(String args[])
    {
        Addable ad1 = (a,b)->(a+b);
        System.out.println(ad1.add(10,20));
        //in the earlier defination, we did not give the types of the arguments but here we have given. Both the methods are valid.
        Addable ad2 = (int a, int b)->(a*b);
        System.out.println(ad2.add(100,200));
    }
}