
//private encapsulation this.var
// human brain analogy one person should not be able to know what other is thinking and should only be given access when then owner allows 

class Example {
    private String name;                      //this is a private instantaneous variable and can only be called within the same class 
    private int age;                          //but in order to access these we can use methods like Setter and Getter which are public and can be used in other classes as well

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;                      //this.variable helps user to determine which variable is local or which one is instantaneous || this refers to the object calling these methods
    }
    public String getName() {
        return name;
    }
    public void setName(String name,Example obj) {         //this is how you can think the internals of this works like
        obj.name = name;                     
    }

}

public class encapsulation{
    public static void main(String a[]) {
        Example obj = new Example();
        
        obj.setAge(9);
        obj.setName("Saiyam", obj);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}