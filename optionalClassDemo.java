import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class optionalClassDemo {
    public static void main(String a[]) {
        List<String> names = Arrays.asList("Saiyam", "Mudgal", "Shreeya");

        Optional<String> name = names.stream()
                                .filter(str -> str.contains("S"))
                                .findFirst();
                                //.orElse("NOT FOUND");

        System.out.println(name.get());
        //either use option or use orElse method
    }
}