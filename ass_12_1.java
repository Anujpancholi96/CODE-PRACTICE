import java.util.*;

public class ass_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        

        System.out.println("average = " + ave(a, b, c) +"\n");
        sc.close();
    }
    public static float ave(int a, int b, int c){
        return(a + b + c)/3 ;
    }
}
