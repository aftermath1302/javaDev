
class Example extends Object{              //using super we are calling the constructor of object class
    int age;
    String name;

    public Example() {                           //construct must have the same name as class and it does not need any return type 
        super();                        //already present without mentioning call the constructor of super class which is default not parameterised                        
        age = 10;
        name = "Saiyam";
    }

    public Example(int age, String name) {        //parameterised constructor
        this();                                   //this will call the default constructor of the same class
        this.age = age;
        this.name = name;
    }

}

public class constructor {
    public static void main(String a[]) {
        Example obj = new Example();
        Example obj1 = new Example(2,"Saiyam");

        System.out.println(obj.age);
        System.out.println(obj.name);

        System.out.println(obj1.age);
        System.out.println(obj1.name);
    }
}