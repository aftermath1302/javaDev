
class A extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            Thread.sleep(10);
        }
    }
}

class B extends Thread{
    public void run() {                                       //start in thread class executes run method
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class threadDemo {
    public static void main(String a[]) {
        A obj = new A();
        B obj1 = new B();

        System.out.println(obj1.getPriority());
        obj.setPriority(Thread.MAX_PRIORITY);

        obj.start();                                           //they start and run
        obj1.start();                                         //creates the thread
    }
}
