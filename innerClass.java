//classExample is A class here 

class classExample {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {                      //since this is static class it can be called with the help of class name 
        public void config() {
            System.out.println("in config");
        }
    }

/*    class B {
        public void config() {
            System.out.println("in config");
        }
    }
*/
}

public class innerClass {
    public static void main(String a[]) {
        classExample obj = new classExample();
        obj.show();
        
//        A.B obj1 = obj.new B();        //A.B means B belongs to A after compiled it says A$B.class file 
        classExample.B obj1 = new classExample.B();
        obj1.config();
    }
}
