// named constants 
// enum in java extends enum class 

enum Laptop {
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;
    
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
//-----------------------------------------------------------------------------------

enum Status {
    Running, Failed, Pending, Success;
}

public class enumDemo {
    public static void main(String a[]) {

        for (Laptop lap: Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

//------------------------------------------------------------------------------------
        Status[] ss = Status.values();
        
        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }

        Status a1 = Status.Success;
        switch(a1) {
            case Running:
                System.out.println("its okay");
                break;
            case Failed:
                System.out.println("try again");
            default:
                break;
        }
    }
}
