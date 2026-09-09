
class A {
    public void show() {
        System.out.println("in show A...");
    }
}

class B {
    public void show() {
        System.out.println("in show B...");
    }
}

public class AnonymousInnerClass {
    public static void main(String a[]) {              //you can also extend an abstract class with anonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("this is a anonymous inner class");
            }
        };
        obj.show();
    }
}
