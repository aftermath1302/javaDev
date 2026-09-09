interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code() {
        System.out.println("code decode...");
    }
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code decode faster...");
    }
}

class Dev {
    public void work(Computer comp) {
        comp.code();
    }
}

public class importanceInterface {
    public static void main(String a[]) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Dev saiyam = new Dev();
        saiyam.work(laptop);
        saiyam.work(desktop);
    }
}