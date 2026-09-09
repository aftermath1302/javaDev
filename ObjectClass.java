
class Laptop {
    String model;
    int price;

    public String toString() {
        return "Hey";
    }
}

public class ObjectClass {
    public static void main(String a[]) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj);   //toString is beign called automatically because it is part of the 
    }
}
