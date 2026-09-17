import java.util.HashMap;
import java.util.Map;       //not following a sequence keys are unique cant repeat keys are set and value are list

public class mapDemo {
    public static void main(String a[]) {
        Map<String,Integer> students = new HashMap<>();     //HashMap is not and HashTable is synchronised
        students.put("Navin", 56);             //add -> add new element
        students.put("Harsh", 23);             //put -> try to add if already present key just update it
        students.put("Saiyam", 67);
        students.put("Mudgal", 92);
        students.put("Harsh", 45);

        System.out.println(students);
        System.out.println(students.get("Harsh"));
        System.out.println(students.keySet());

        for (String key: students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
