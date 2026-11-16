public class constructorchaining{
    public static void main(String[] args) {
        B o1 = new B();
    }
}

class A{
    A(){
        System.out.println("a 1");
    }
}
class B extends A{
    B(){
        this(4);
        System.out.println("b 1");
    }
    B(int l){

        System.out.println("b 2");
    }
}