public class multilevelinheritance {
    public static void main(String[] args) {
        dog lamar = new dog();
        lamar.eat();
        lamar.legs = 5;
        System.out.println(lamar.legs);
    }
}

class animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

class mammal extends animal{
    int legs;
}

class dog extends mammal{
    String breed;
}