public class MAXSUM2{
    public static void maxsum(int numbers[]){
       int currrsum = 0;
       int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int [numbers.length];

       prefix[0] = numbers[0];
       //calculte prefix array
       for(int i = 1; i <prefix.length; i++){
        prefix[i] = prefix[i - 1] + numbers[i];
       }


       for(int i = 0; i < numbers.length; i++){
        int start = i;
        for(int j = 0; j < numbers.length; j++){
            int end = j;

            currrsum = start == 0 ? prefix[end] : prefix[end] - 1;

            if(currrsum > maxsum){
                maxsum = currrsum;
            }

    }
}
        System.out.println("max sum = " + maxsum);

    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        maxsum(numbers);

    }

}
