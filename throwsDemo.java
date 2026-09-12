
class C {
    public void show() {
        try{
            A obj = new A();
            B obj1 = new B();
            obj.show();
            obj1.show();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

class B {
    public void show() throws ArithmeticException {
        int i = 0;
        int j = 0;
        j = j/i;
    }
}

class A {
    public void show() throws ArithmeticException {
        int i = 0;
        int j = 0;
        j = j/i;
    }
}

class throwsDemo {
    public static void main(String a[]) {            //never put throws in main since above main its JVM and for JVM he doesnt care if the code runs or not it will stop the exec
        C obj2 = new C();
        obj2.show();
    }
}
