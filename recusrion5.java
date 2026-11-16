public class recusrion5 {
    
    public static int Fib(int n){
        if(n == 0 || n == 1){
        return n;
    }
        int Fibnm1 = Fib(n - 1);
        int Fibnm2 = Fib(n - 2);
        int Fibn = Fibnm1 + Fibnm2;
        return Fibn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(Fib(n));
    }
}
