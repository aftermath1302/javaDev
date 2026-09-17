import java.util.HashSet;
import java.util.Set;                //no duplicate elements no sequence either 

public class collectionSetInterface {
    public static void main(String a[]) {

        Set<Integer> nums = new HashSet<Integer>();      //Set is implemented in HashSet while Set implements Collection
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        //nums.add("5");                 //it helps user by giving compile time error istead of runtime error
 
        for (int n : nums) {           
            int num = (Integer) n;
            System.out.println(num);      //if we were to explicitly typecase it will not detect error in compile time
        }
    }
}
