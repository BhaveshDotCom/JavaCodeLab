package OOPS.Polymorphism;

// Method Override

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal duck = new Duck();
        duck.walk();

        Animal dog = new Dog();
        dog.walk();
        
    }
    
}

abstract class Animal {
    abstract void walk();
}

class Duck extends Animal {

    void walk() {
        System.out.println("Duck walks slowly near the pond");
    }
}


class Dog extends Animal {

    void walk() {
        System.out.println("Dog walks and runs energetically");
    }
}
