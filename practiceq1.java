public class practiceq1 {
    public static int searching(int matrix[][],int key){
        
        int frequency = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    frequency++ ;
                }
            }
        }
        return frequency;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,7},
                            {13,14,7,16}};
        int key = 7;
        System.out.println(searching(matrix,key) );                   
    }
}
