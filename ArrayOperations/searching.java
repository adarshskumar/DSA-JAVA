package ArrayOperations;

import java.util.Scanner;

public class searching {

    static int[] Finder(int[] arr,int target) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("found at"+i);
            } else{
                System.out.println("Not found");
                break;
            }
        }

        return new int[0];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter target variable");
        int target= sc.nextInt();
        
        System.out.println("Input array: ");
        //input array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output array: ");
        //output array
        for (int i = 0; i <size; i++) {
            System.out.println(arr[i]);
        }

        int rslt[] = Finder(arr,target);

        for (int i = 0; i < rslt.length; i++) {
            System.out.println(rslt[i]);
        }

        sc.close();

    }
}
