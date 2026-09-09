
class Example {
    public Example() {
        System.out.println("object created....");
    }
    public void show() {
        System.out.println("in A show...");
    }
}

public class object {
    public static void main(String a[]) {
        Example obj1 = new Example();                //referenced object can be called anywhere again
        obj1.show();
        new Example();                              //anonymous object can only be run once when initiated
        new Example().show();                       // again creates a new object doesnt call the method in the same object    
    }    
}
