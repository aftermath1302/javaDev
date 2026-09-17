import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age , String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age  > that.age)
                    return 1;
                else 
                    return -1;
        
    }
}

public class studentComparator {
    public static void main(String a[]) {

        // Comparator<Student> com = (Student i, Student j) -> {
        //     if (i.age  > j.age)
        //         return 1;
        //     else 
        //         return -1;
        // };

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(21,"Saiyam"));
        studs.add(new Student(23,"Mudgal"));
        studs.add(new Student(20,"Shreeya"));

         Collections.sort(studs /*, com*/);

        for (Student s: studs)
            System.out.println(s);
    }
}