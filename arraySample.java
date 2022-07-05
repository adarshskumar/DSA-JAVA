import java.util.Scanner;

public class arraySample {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int[] arr= new int[size];

        //input
        System.out.println("Enter elements of the array");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array");
        //output
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
