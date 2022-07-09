// import java.util.HashSet;
// import java.util.Set;

//Q1. Sum of two elements in the given array is 10. Find the elements

public class arr1 {
    public static int[] twoNumberSum(int[] arr, int target){
        // method-1
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }

        //method-2
        // Set<Integer> nums= new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     int num = arr[i];
        //     int match = target-num;
        //     if(nums.contains(match)){
        //         return new int[]{num,match};
        //     } else {
        //          nums.add(num);
        //     }
        // }


        return new int[0];
    }

    public static void main(String[] args){
        int[] arr={6,5,7,9,4,0,2};
        int target=10;
        int[] result = twoNumberSum(arr, target);
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }

}
