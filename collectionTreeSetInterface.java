import java.util.Set;
import java.util.TreeSet;        //treeSet gives you sorted array

public class collectionTreeSetInterface {
    public static void main(String a[]) {

        Set<Integer> nums = new TreeSet<Integer>();    
        nums.add(54);
        nums.add(82);
        nums.add(21);
        //nums.add("5");                 //<> helps user by giving compile time error istead of runtime error
 
        for (int n : nums) {           
            int num = (Integer) n;
            System.out.println(num);      //if we were to explicitly typecase it will not detect error in compile time
        }
    }
}
