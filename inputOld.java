import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class inputOld {
    public static void main(String a[]) {
        System.out.println("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in)
        BufferedInputStream bf = new BufferedInputStream(in);

        int a = Integer.parseInt(bf.read());
        
        bf.close();
    }
}
