package matrix;

import java.util.Scanner;

public class q1 {

    static boolean HishemsQn(int[][] a ,int target) {
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]==target) {
                    return true;
                } 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of cols:");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter all the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Entered Matrix: ");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        boolean rslt = HishemsQn(a, 3);
        System.out.println(rslt);

        // System.out.println("Result Matrix: ");
        // for (int i = 0; i < rslt.length; i++) {
        //     for (int j = 0; j < rslt.length; j++) {
        //         System.out.println(rslt[i][j]);
        //     }
        //     System.out.println();
        // }

        sc.close();
    }

}
