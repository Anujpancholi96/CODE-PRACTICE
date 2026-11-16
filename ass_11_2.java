import java.util.*;

public class ass_11_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;
       
        System.out.println("enter n:  ");
         int n = sc.nextInt();


        int num;

        for(int i = 0; i < n; i++){
            num = sc.nextInt();
            if(num % 2 == 0){
                evensum += num ;
            }
            else{
                oddsum += num ;
            }
            
        }
        System.out.println("the sum of even numbers is =" + evensum);
         System.out.println("the sum of odd numbers is =" + oddsum);

         sc.close();
    }
}