//op gets a new phone and has the choice to say that he has his own or his fathers but his father can only say he has his own phone.


class A {
    public void show() {
        System.out.println("in A show");
    }
    public void config() {                                      //we need config from parent but not show
        System.out.println("in config...");
    }
}

class B extends A {
    public void show() {                                        //therefore we create show and override it 
        System.out.println("in B show");
    }
}

public class overriding {
    public static void main(String a[]) {
        B obj = new B();
        obj.show();
    }
}