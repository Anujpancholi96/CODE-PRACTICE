 public class SOLUTION {
    public static boolean isSorted(int nums[]) {
        //your code goes here
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < nums[i + 1]){
                return true;
            }
        }
        return false;
       

    }
    public static void main(String[] args){
        int nums[] = {2,3,4,5,7};
        if(isSorted(nums)){
            System.out.print("array is sorted");
    }
    else{
        System.out.print("array is not sorted");
    }
}
}
