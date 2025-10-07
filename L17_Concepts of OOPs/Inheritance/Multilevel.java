
class Grandparent {
    void showGrandparent() {
        System.out.println("I am the grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am the parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am the child");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}
