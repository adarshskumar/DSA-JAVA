package ArrayOperations;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        return new int[0];
        
    }
        public static int[] reverse(int[] nums,int start, int end){
            while(start<end){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            return new int[0];
        }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        int[] rslt = rotate(nums,3);
        for(int i=0; i<rslt.length;i++){
            System.out.println(rslt[i]);
        }
    }    
}
