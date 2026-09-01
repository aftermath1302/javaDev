
//class - class -> extends 
//class - interface -> implements
//interface - interface -> extends

interface A {                                 //all methods have public abstract attribute
    
    int age = 44;                            // these variable are final and static thus cna be used with interface name
    String area = "Delhi";
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {                         //it contains run method now so we can use A.Y below
    
}

//can extend multiple interface but cant do the same with abstract class
class B implements A,X {                        //define both or make the class abstract
    public void show() {
        System.out.println("in show");       
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("running");
    }
}

public class interfaceDemo {
    public static void main(String a[]) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

//        A.area = "Hyderabad";                   //becuase this is final so cannot be changed
        System.out.println(A.age);

    }
}
