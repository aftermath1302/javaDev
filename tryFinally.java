public class tryFinally {
    public static void main(String a[]) {

        int i = 2;
        int j = 0;
        try {
            j = 18/i
            // System.out.println("bye");
        }
        catch (Exception e) {
            System.out.println(e);
            // System.out.println("bye");
        }
        finally {                            //irrespective of the exception this block runs
            System.out.println("bye");       //why would we want that : To close resources
        }
    }
}
