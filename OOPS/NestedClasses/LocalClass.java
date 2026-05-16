package OOPS.NestedClasses;

public class LocalClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet("Bhavesh");

        OuterNumber outerNumber = new OuterNumber();
        outerNumber.displayNum();
        outerNumber.displayAcquiredNum();
    }    
}

class Outer {

    void greet(String name){

        class Inner {
            void sayHello(){
                System.out.println("Hello, " + name);
            }
        }

        Inner inner = new Inner();
        inner.sayHello(); 
    }
}

class OuterNumber {

    Object displayNum(){

        int num = 100;
        class Local {
            void printNum() {
                System.out.println("Number: "+num);
            }
        }

        Local localOne = new Local();
        localOne.printNum();

        return localOne;
    }

    void displayAcquiredNum(){
        Object localTwo = displayNum();
        System.out.println(localTwo);
    }
}
