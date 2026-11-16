public class hybridinheritance {
    public static void main(String[] args) {
        dog lamar = new dog();
        lamar.legs = 5;
        lamar.eats();
        System.out.println(lamar.legs);
        lamar.walks();
        cat meow = new cat();
        meow.eats();
        meow.walks();
        meow.play();
        human anuj = new human();
        anuj.eats();
        anuj.walks();
        anuj.think();
        bird eagle = new bird();
        eagle.eats();
        eagle.fly();
        peacock p = new peacock();
        p.eats();
        p.dance();
        fish gold = new fish();
        gold.eats();
        gold.swim();
        tuna t = new tuna();
        t.eats();
        t.swim();
        t.bites();
        shark sharky = new shark();
        sharky.eats();
        sharky.swim();
        sharky.hunt();
    }
}

class Animal{
    void eats(){
        System.out.println("eats");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class tuna extends fish{
    void bites(){
        System.out.println("bites");
    }
}
class shark extends fish{
    void hunt(){
        System.out.println("kills");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
class peacock extends bird{
    void dance(){
        System.out.println("dances");
    }
}
class mammal extends Animal{
    void walks(){
        System.out.println("can walk");
    }
}
class dog extends mammal{
    int legs;
}
class cat extends mammal{
    void play(){
        System.out.println("playfull");
    }
}
class human extends mammal{
 void think(){ 
      System.out.println("mindful");
}
}