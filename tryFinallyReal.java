import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class tryFinallyReal {
    public static void main(String a[]) {
        int num = 0;
        
        try {
            BufferedInputStream bf = new BufferedInputStream(new InputStreamReader(System.in));
            bf.read();
        } 
        finally {
            bf.close();
        }
    }
}
