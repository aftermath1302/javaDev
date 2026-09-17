import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortDemo {
    public static void main(String a[]) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10) 
                    return 1;             //1 means swap -1 means no swap  
                else 
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<> ();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums);         //Collections is an class of java.util class;

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
