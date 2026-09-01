public class string {
    public static void main(String a[]) {
        String name = "Saiyam";    //String starts with a capital letter that means it is not a primitive data type
        name = name + " Neolia";  //this is not changing the string name it is just creating a new string in the STRING CONSTANT POOL and refrencing that address to name Hence IMMUTABLE STRINGS
        String name2 = "Saiyam";

        System.out.println(name == name2);    //TRUE since the referencing address is the same 
        System.out.println(name.length());     //length() cause this is a method in String class

        StringBuffer sb = new StringBuffer("Saiyam");
        System.out.println(sb.capacity());  //16bit buffer therefore 16 + 6 = 22bits
        sb.append(" Neolia");

        String str = sb.toString();
        System.out.println(str);
        sb.ensureCapacity(100);
    }
}