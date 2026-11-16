public class MAXSUM{
    public static void maxsum(int numbers[]){
        int currsum = 0;
        int maxsum1 = Integer.MIN_VALUE;

       for(int i = 0; i < numbers.length; i++){
        int start = i;
        for(int j = 0; j < numbers.length; j++){
            int end = j;
             currsum = 0;
             for(int k = start; k <= end; k++){
                currsum += numbers[k];
             }
             //System.out.println(currsum);
             if(maxsum1 < currsum){
                maxsum1 = currsum;
             }
        }
    }
            System.out.print("maxsum = " + maxsum1);
        }
        public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        
        maxsum(numbers);
        

    }
    
    }
    