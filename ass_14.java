public class ass_14 {
    public static void bubblesort(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        int minpos;
        for(int i = 0; i < arr.length - 1; i++){
             minpos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i = i; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr){
                
            }
        }




    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
      //  bubblesort(arr);
          selectionsort(arr);
        print(arr);
    }
}
