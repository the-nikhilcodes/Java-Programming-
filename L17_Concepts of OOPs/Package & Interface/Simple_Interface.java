
interface Animal {
    void sound();   // abstract method
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class Simple_Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();

        a = new Cat();
        a.sound();
        a.eat();
    }
}
