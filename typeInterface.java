
@FunctionalInterface                      //only one abstract method
interface A {
    void show(int a);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show...");
//     }
// }

public class typeInterface {
    public static void main(String a[]) {
        A obj = (a1) -> {                                                      //syntactical sugar lambda expression can only be used by function interface
                System.out.println("ïn main class..." + a1);                   // no file for this method thus less files but at the same time typeInterface compiled file will be bigger
            }; 
        obj.show(5);
    }
} 