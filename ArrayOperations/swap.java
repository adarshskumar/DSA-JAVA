package ArrayOperations;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array: ");
        for(int i=0;i< n;i++)
                    System.out.print(arr[i]+" ");
        int temp=0;
        int m = n ;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                temp=arr[i];
                arr[m-1]=arr[i];
                arr[m-1]=temp;
                m--;
            }
        }
        System.out.println("\nSorted Array: ");
        for(int i=0;i< n;i++)
                    System.out.print(arr[i]+" ");
        // int c=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]!=0){
        //         arr[c++]=arr[i];
        //     }
        // }
        
    }
}
