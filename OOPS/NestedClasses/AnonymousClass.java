package OOPS.NestedClasses;

public class AnonymousClass {

    public static void main(String[] args) {
        Human human = new Human(){
            @Override
            void greet() {
                System.out.println("Good Morning");
            };
        };

        human.greet();
    }
    
}

class Human {
    void greet(){
        System.out.println("Hello, I am Human");
    }
}