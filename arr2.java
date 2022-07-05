// public class arr2 {
//     public static int[] swapToEnd(int[] arr, int target){
//         int j=arr.length-1;
//         int i=0;
//         while(i<j){
//             while(i<j && arr[i]==target){
//                 j--;
//             }
//             if(arr[i]==target){
//                 int temp=arr[j];
//                 arr[j]=arr[i];
//                 arr[i]=temp;
//             }
//             i++;
//         }

//         // for(int i=0;i<arr.length;i++){
//         //     for(int j=arr.length-1;j>=0;j--){
//         //         if(arr[i]==target){
//         //             int temp=arr[i];
//         //             arr[i]=arr[j];
//         //             arr[j]=temp;
//         //         }
//         //     }
//         // }
//         return arr;
//     }

//     public static void main(String[] args){
//         int[] arr={6,1,6,8,10,4,15,6,3,6,6};
//         int target=6;
//         int[] result= swapToEnd(arr, target);
//         for(int i=0;i<result.length;i++){
//             System.out.println(result[i]);
//         }
//     }
// }

//to define array size
// int[] ar = new int[20];


public class arr2 {
    public static int[] SwapToEnd(int[] Array,int target)
    {
        int j = Array.length - 1;
            for (int i = 0; i < Array.length; i++) 
            {
                if (Array[i] == target && i < (j - 1))
                {
                    while (Array[j] == target && i < (j - 1))
                    {
                        j--;
                    }
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
            return Array;
    }
    
    
	public static void main(String[] args) 
	{
	    int[] Array={6,1,6,8,10,4,15,6,3,9,6};
	    int target=6;
	    System.out.print("Before : "); 
	    for(int i=0;i<Array.length;i++)
	    {
	        System.out.print(Array[i]+" "); 
	    }
	    
	    int[] Result=SwapToEnd(Array,target);
	    
	    System.out.print("\nAfter  : "); 
	    for(int i=0;i<Result.length;i++)
	    {
	        System.out.print(Result[i]+" "); 
	    }
	}
}