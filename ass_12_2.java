import java.util.*;

public class ass_12_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("enter a number :");
         num = sc.nextInt();

         if(isEven(num)){
            System.out.println("it is even");
         }
         else{
            System.out.println("it is odd");
            sc.close();
         }
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}