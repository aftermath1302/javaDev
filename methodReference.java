import java.util.Arrays;
import java.util.List;

public class methodReference {
    public static void main(String a[]) {
        List<String> names = Arrays.asList("Saiyam", "Mudgal", "Shreeya");

        List<String> uNames = names.stream()
                                    //.map(name -> name.toUpperCase())
                                    .map(String::toUpperCase)       //this is called method reference
                                    .toList();

        uNames.forEach(System.out::println);
    }
}
