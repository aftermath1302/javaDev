// final - variable, method, class

final class Calc {                                              //no one can extends the class
    public void show() {
        System.out.println("This was made by the Owner...");
    }
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

/* class AdvCalc extends Calc {
    public void show() {
        System.out.println("this was made by Saiyam")
    }
} */

public class FinalDemo {
    public static void main(String a[]) {
        final int num = 8;                      // once assigned cannot be changed 
        // num = 9;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(2,2);
    }
}
