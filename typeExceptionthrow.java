// Types of exception :
// 1. Compile time error  -> occcurs during compilation of code if the file is missing or some like that
// 2. Runtime error -> occurs during the running of code , In this the code may break at anytime
// 3. Logical error -> the expected outcome is much weirer than the latest 
// Types of statements :
// 1. Normal 
// 2. Critical [we write exception for these]

class SaiyamException extends Exception{                      //in order to make a custom exception we need to and must extend exception class
    public SaiyamException(String str) {           
        super(str);                                           //sending the str to super class the super class has its own method to display the error
    }
}

public class typeExceptionthrow {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;
        int[] arr = new int[5];
        try {
            // j = i/j;                                      //these two are critical statements here
            j = arr[5];
            if (j==0) {
                throw new SaiyamException("the result can not be zero");
            }
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
