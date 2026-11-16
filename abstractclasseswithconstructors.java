public class abstractclasseswithconstructors{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("constructor of Animal");
    }
} 
class Horse extends Animal{
    void changecolor(){
        color = "dark brown";
    }
    Horse(){
        System.out.println("constructor of Horse");
    }
}