interface Animal {
  int eyes =2;
   void walk();   // by default_public
}

class Horse implements Animal {
   public void walk(){
    System.out.println("Walks on 4 legs ");
   }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
