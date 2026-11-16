import java.util.*;

public class ass_11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter n :");
         n = sc.nextInt();

         int fact = 1;
         for(int i = 1; i <= n; i++){
             int prod =  i ;
             fact =  fact * prod ;

            
           
         }
          System.out.print("factorial = " + fact);
         System.out.println();

         sc.close();
        



    }
}
