class Parent {
    void showParent() {
        System.out.println("I am the parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am the child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.showParent();
        c.showChild();
    }
}
