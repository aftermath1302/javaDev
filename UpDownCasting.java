class A {
    public void show1() {
        System.out.println("in A show...");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show...");
    }
}

public class UpDownCasting {
    public static void main(String a[]) {
        A obj = new A();
        obj.show1();

        B obj1 = new B();            // B knows what A is but A doesnt
        obj1.show1();
        obj1.show2();

        A obj2 = (A) new B();        //upcastingv happens automatically
        obj2.show1();

        B obj3 =  (B) obj2;
        obj3.show2();                //downcasting 
    }
}