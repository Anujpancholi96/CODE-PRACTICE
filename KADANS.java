public class KADANS{
    public static void kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.print("our max subarray sum is " + ms);


    }

    public static void main(String[] args) {
        int numbers[] =  {-2 , -3, 4, -1, -2, 5, -3};
        kadans(numbers);
    }

}