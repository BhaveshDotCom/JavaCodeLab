package StandardIO;

public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        MySystem.MyOut.printOne();
    }
    
}

// Under The Hood
class MyPrintStream {
    public final void printOne(){
        System.out.println(1);
    }
}

class MySystem {
    public static final MyPrintStream MyOut = new MyPrintStream();

}
