import java.util.Collection;
import java.util.TreeSet;   
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String a[]) {

        Collection<Integer> nums = new TreeSet<Integer>();    //collection implements iterator
        nums.add(54);
        nums.add(82);
        nums.add(21);
        
        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
