
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7,8,3,1,2};

        //  Time Comlexity =O(n^2)
        //Bubble Sort   
        for (int i = 0 ; i<arr.length; i++){             //n-1 time run
            for( int j= 0; j<arr.length-i-1; j++){   
                if (arr [j] > arr[j+1]) {
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        System.out.println("Your Sorted array is :");
        printArray(arr);
    }
}
