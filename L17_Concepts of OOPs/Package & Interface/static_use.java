
class Student {
    String name ;
    static String school ;
}

public class static_use {
    public static void main(String[] args) {
        Student.school ="IIT KANPUR";
        Student s1 = new Student();
        s1.name = "Nikhil";
        System.out.println(s1.school);
    }
}
