interface Animal {
    void makeSound();
    void countLegs();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("A dog barks.");
    }

    public void countLegs() {
        System.out.println("A dog walks on four feet.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("A cat meows.");
    }

    public void countLegs() {
        System.out.println("A cat walks on four feet.");
    }
}

class Duck implements Animal {
    public void makeSound() {
        System.out.println("A duck quacks.");
    }

    public void countLegs() {
        System.out.println("A duck walks on two feet.");
    }
}

public class multipleInhertance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.makeSound();
        d.countLegs();
        Cat c = new Cat();
        c.makeSound();
        c.countLegs();
        Duck k = new Duck();
        k.makeSound();
        k.countLegs();
    }
}