
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {   // Multiple inheritance via interfaces
    public void eat() {
        System.out.println("Dog eats bones");
    }
    public void play() {
        System.out.println("Dog loves to play");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
