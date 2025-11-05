import java.io.*;

class Student implements Serializable {
    String name;
    int age;
}

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {

        // --- Write object ---
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
        oos.writeObject(s1);
        oos.close();

        // --- Read object ---
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}
