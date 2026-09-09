abstract class Car {                            //class should aslo be abstract
    public abstract void drive();               // i am giving you and idea but i dont know how to make it so you can make it by extending this class
//    public abstract void fly();               // wagonR needs to declare and instantiate fly and if the class cant do it it becomes abstract as well and can not be used in main class

    public void playMusic() {
        System.out.println("play music");
    }
}

// concrete class
class WagonR extends Car {                      //when you extend the abstract class you need to override the method
    public void drive() {
        System.out.println("Driving...");
    }
}

public class AbstractDemo {
    public static void main(String a[]) {
//        Car obj = new Car();                    //abstract class object is not possible
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
