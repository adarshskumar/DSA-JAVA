package ArrayOperations;

public class BinarySearch {
    public static int binaryIter(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle=start+ (end-start)/2;
            if(arr[middle]==target){
                return middle; //found at middle
            }
            else if(arr[middle]>target) 
                end=middle-1;
            else if(arr[middle]<target) 
                start=middle+1;
        }
        return -1; //-1 for exit (onnum illa) if there is no element
    }

    public static int binaryRec(int[] arr, int target){
        return binaryRecHelper(arr, target, 0, arr.length-1);
    }

    public static int binaryRecHelper(int[] arr, int target, int start, int end){
        while(start<=end){
            int middle=start+ (end-start)/2;
            if(arr[middle]==target){
                return middle; //found at middle
            }
            else if(arr[middle]>target) 
                return binaryRecHelper(arr, target, start, middle-1);
            else if(arr[middle]<target) 
                return binaryRecHelper(arr, target, middle+1, end);
        }
        return -1;
        // if(start>end){
        //     return -1;
        // }
        // int middle=start+ (end-start)/2;
        // if(arr[middle]==target){
        //     return middle;
        // }
        // else if(arr[middle]>target) 
        //     return binaryRecHelper(arr, target, start, middle-1);
        // else if(arr[middle]<target) 
        //     return binaryRecHelper(arr, target, middle+1, end);
        // return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // if(binaryIter(arr, 0)==-1){
        //     System.out.println("Not Found");
        // } else
        // System.out.println("Is Found at position: "+binaryIter(arr, 0));
        System.out.println(binaryRec(arr, 7));
    }
}
