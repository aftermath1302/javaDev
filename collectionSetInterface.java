import java.util.HashSet;
import java.util.Set;                //no duplicate elements

public class collectionSetInterface {
    public static void main(String a[]) {

        Set<Integer> nums = new HashSet<Integer>();      //Set is implemented in HashSet while Set implements Collection
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5");                 //it helps user by giving compile time error istead of runtime error
 
        for (n : nums) [           
            int num = (Integer) n;
            System.out.println(num * 2);      //if we were to explicitly typecase it will not detect error in compile time
        ]
    }
}
