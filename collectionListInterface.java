import java.util.ArrayList;
import java.util.List;

class collectionListInterface {
    public static void main(String a[]) {
        List<Integer> nums = new ArrayList<Integer>();
        int b = nums.set(0,2);
        int c = nums.get(0);
        int d = nums.indexOf(2);
        System.out.println(d + " , " + b + " , " + c);
    }
}