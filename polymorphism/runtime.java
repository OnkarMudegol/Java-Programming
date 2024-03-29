//Here multiple methods of the same name and parametes are created in the parent and the child class. At runtime when the method is called through an instance/object of the child class, the definition in the chilc class overrrides the one in the parent class. This is also known as late binding  or dynamic binding. Function overriding.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void makeSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog says: woof woof");
    }
}

public class runtime {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // create an Animal object
        Animal myPig = new Pig();  // create a Pig object
        Animal myDog = new Dog();  // create a Dog object

        myAnimal.makeSound();  // call the makeSound method of the Animal class
        myPig.makeSound();  // call the makeSound method of the Pig class
        myDog.makeSound();  // call the makeSound method of the Dog class
    }
}
