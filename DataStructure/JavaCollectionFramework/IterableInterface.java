package DataStructure.JavaCollectionFramework;
import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // Collection<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        System.out.println(arrList);
        System.out.println(arrList.size());

        Iterator<Integer> it = arrList.iterator();
        /*
        Under the hood implementation

        public Iterator<E> iterator() {
            return this.listIterator();
        }

    
        */

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
