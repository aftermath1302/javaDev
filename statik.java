
class Mobile {
    String brand;
    int price;
    static String name;     // belongs to the class and is shared by all objects

    static {        
        name ="Phone";
        System.out.println("in static block");      // runs once when the class is initialized
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor block");   //this will run every time the obj is instantiated 
    }

    public void show() {
        System.out.println(brand + "," + price + "," + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + "," + obj.price + "," + name);               //which brand or price is it of obj1 or obj2    by passing parameter we are referencing to the obj we want to use 
    }
}

public class statik {
    public static void main(String a[]) throws ClassNotFoundException {

        Class.forName("Mobile");        //load class without loading object

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 10000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 15000;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);           //static variable and method can only be used by class not the object 
    }
}