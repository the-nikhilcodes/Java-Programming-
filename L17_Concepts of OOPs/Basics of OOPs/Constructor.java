
class Student {
    String Name;
    String Course;

    public void printInfo() {
        System.out.println(this.Name); // This , keyword jo hme btata hai ki use kaun si object access karne ki koshish  kar rahi hai

        System.out.println(this.Course);
    }

    // NON - Parametrized Constructor

    // Student() {
    // System.out.println("Constructor Called");
    // }

    // Parametrized Constructor

    // Student (String Name, String Course){
    // this.Name = Name;
    // this.Course =Course;
    // }

    // Copy Constructor
    
    // Student(Student s2) {
    //     this.Name = s2.Name;
    //     this.Course = s2.Course;
    // }

    // Student() {

    // }

}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Nikhil";
        s1.Course = "BCA";

        Student s2 = new Student(s1);
        s1.printInfo();

    }
}
