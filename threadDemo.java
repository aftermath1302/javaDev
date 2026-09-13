
class A extends Thread{
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class threadDemo {
    public static void main(String a[]) {
        A obj = new A();
        B obj1 = new B();

        obj.show();
        obj1.show();
    }
}
