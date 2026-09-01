
class Student {
    String name;
    int roll;
}

class array {
    public static void main(String a[]) {
        int arr[] = {1,2,3,4};
        int arr1[] = new int[4];     //initialises the array to 0
        int nums[][] = new int[3][4];   // 2D array
        System.out.println(nums[0][0]);  

        int nums1[][] = new int[3][];  //jagged array
        nums1[0] = new int[2];
        nums1[1] = new int[4];
        nums1[2] = new int[1];

        Student s1 = new Student();  
        s1.name = "Saiyam";
        s1.roll = 93;

        Student s2 = new Student();
        s2.name = "Mudgal";
        s2.roll = 82;

        Student students[] = new Student[2];  //array of objects
        students[0] = s1;
        students[1] = s2; 

        for (Student stud : students) {
            System.out.println(stud.name);
        }


        System.out.println(arr[0]);
        System.out.println(arr1[0]);
    }
}