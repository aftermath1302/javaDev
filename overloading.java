class Calculator {
    public int add(int a, int b) {             //can have multiple same named methods with different parameters or parameter type
        return a + b;
    }
}

public class overloading {
    public static void main(String a[]) {
        Calculator obv = new Calculator();
        System.out.println(obv.add(2,3));
    }
}