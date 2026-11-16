public class interfacehw {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.Hunt();
    }
}

interface herbivore{
    void eat();
}
interface carnivore{
    void Hunt();
}

class Bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("bear eats grass");
    }
     public void Hunt(){
        System.out.println("bear kills");
    }
}

