package ArrayOperations;

public class BinarySearch {
    public static int binaryIter(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle=start+ (end-start)/2;
            if(arr[middle]==target){
                return middle;
            }
            else if(arr[middle]>target) 
                end=middle-1;
            else if(arr[middle]<target) 
                start=middle+1;
        }
        return -1;
    }

    public static int binaryRec(int[] arr, int target){
        return binaryRecHelper(arr, target, 0, arr.length-1);
    }

    public static int binaryRecHelper(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int middle=start+ (end-start)/2;
        if(arr[middle]==target){
            return middle;
        }
        else if(arr[middle]>target) 
            return binaryRecHelper(arr, target, start, middle-1);
        else if(arr[middle]<target) 
            return binaryRecHelper(arr, target, middle+1, end);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // System.out.println("Is Found at position: "+binaryIter(arr, 3));
        System.out.println(binaryRec(arr, 3));
    }
}
