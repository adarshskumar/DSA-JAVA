package ArrayOperations;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter target variable: ");
        int target = sc.nextInt();
        //input array
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //output array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
