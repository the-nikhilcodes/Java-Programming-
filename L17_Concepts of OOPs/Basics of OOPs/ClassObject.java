
class Student  {
    String Name;
    String Course ;

    public void printInfo(){
       System.out.println(this.Name);   // This , keyword jo hme btata hai ki use kaun si object access karne ki koshish kar rahi hai
       System.out.println(this.Course);
    }

}
public class ClassObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Nikhil";
        s1.Course = "BCA";

        Student s2 = new Student();
        s2.Name = "Saurabh";
        s2.Course = "MCA";

        s1.printInfo();
        s2.printInfo();

    }
}
