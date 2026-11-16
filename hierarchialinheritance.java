public class hierarchialinheritance {
    public static void main(String[] args) {
        dog lamar = new dog();
        lamar.eats();
        lamar.legs = 5;
        System.out.println(lamar.legs);
        fish gold = new fish();
        gold.eats();
        gold.swim();
        bird eagle = new bird();
        eagle.eats();
        eagle.fly();

    }
}
class Animal{
    String color;
    void  eats(){
        System.out.println("eats");
    }
}
class dog extends Animal{
    int legs;
}
class bird extends Animal{
    void fly(){
        System.out.println("fliees");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
