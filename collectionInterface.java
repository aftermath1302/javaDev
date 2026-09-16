import java.util.ArrayList;
import java.util.Collection;

public class collectionInterface {
    public static void main(String a[]) {

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums);
    }
}
