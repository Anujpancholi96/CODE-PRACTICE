import java.util.*;

public class MATRIX {
    public static void largest(int matrix[][]){
        int largest = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                    
    }
}
        }
        System.out.print("largest number  = " +largest);
    System.out.println();
    }

    public static void smallest(int matrix[][]){
        int smallest= 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
         System.out.print("smallest number  = " +smallest);
    System.out.println();
    }
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("found on cell (" + i +","+j+")");
                    return true;
                }
               
            }
        }
        System.out.print("key not found");
        return false;
      
}

    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;   

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }   

      for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      //  search(matrix, 5);
        //largest(matrix);
        smallest(matrix);
    }
     
    
    
}
