import java.util.ArrayList;
import java.util.Collection;

public class collectionInterface {
    public static void main(String a[]) {

        Collection<Integer> nums = new ArrayList<Integer>();      //<> these are called generics 
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5");                 //it helps user by giving compile time error istead of runtime error
 
        for (int n : nums) {         
            int num = (Integer) n;
            System.out.println(num * 2);      //if we were to explicitly typecase it will not detect error in compile time
        }
    }
}
