// Concept of bigData:
// in this world we are getting huge data 
// we apply filter to: wanted data unwanted data
// we transform usign map somethign meaningful
// make graph using reduce

import java.util.List;
import java.util.function.Consumer;
//import java.util.stream.Stream;
import java.util.Arrays;

public class streamAPI {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // nums.forEach(n -> System.out.println(n));  --was the easiest way to print 

        Consumer<Integer> con = (Integer n) -> {
            System.out.println(n);
        };

        nums.forEach(con);
        //nums.forEach(con);     //can reuse forEach

        System.out.println("==================================");

        // Stream<Integer> s1 = nums.stream();            //it doesnot change the original stream thus helpful in threads
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(result);
        //  simplified verison below


        //s1.forEach(con);           // cant reuse stream but it provides multiple methods 

        int result = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        System.out.println(result);
    }
}
