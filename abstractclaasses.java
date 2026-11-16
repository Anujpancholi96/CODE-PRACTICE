public class abstractclaasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walk();
        Chicken c = new Chicken();
        c.eats();
        c.walk();
    }
}

abstract class Animal{
    void eats(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse  extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}