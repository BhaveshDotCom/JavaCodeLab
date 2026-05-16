package OOPS.NestedClasses;


public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myClass = new OuterClass.InnerClass(myOuterClass, "Bhavesh");
        myClass.display();
    }

}

class OuterClass {
    private static int age = 19;
    String role = "Engineer";

    static class InnerClass {
        OuterClass OuterClass;
        String name;

        InnerClass(OuterClass OuterClass,String name){
            this.name = name;
            this.OuterClass = OuterClass;
        }

        void display(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Role: "+OuterClass.role);
        }
    }
}