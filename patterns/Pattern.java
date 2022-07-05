package patterns;

public class Pattern {

    // ******
    // ******
    // ******
    // ******
    // ******
    // public static void main(String[] args) {
    //     for(int i = 0; i < 5; i++) {
    //         for(int j = 0; j<5; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }




    // ***** 
    // *   * 
    // *   * 
    // *****       
    // public static void main(String[] args) {
    //     int n=4;
    //     int m=5;
    //     for (int i = 0; i <n; i++) {
    //         for (int j = 0; j<m; j++) {
    //             if(i==0 || j==0 || i==n-1 || j==m-1 ){
    //                 System.out.print("*");
    //             } else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println(" ");
    //     }
    // }




    // *
    // **
    // ***
    // ****
    // *****
    // public static void main(String[] args) {
    //     for(int i = 0; i < 5; i++) {
    //         for(int j = 0; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }



    // ****
    // ***
    // **
    // *
    // public static void main(String[] args) {
    //     int n=4;
    //     for (int i = n; i>0; i--) {
    //         for (int j = 1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    
    //      *
    //     **
    //    ***
    //   ****
    // public static void main(String[] args) {
    //     int n=4;
    //     for (int i = 1; i<=n; i++) {
    //         //inner loop -> space print
    //         for (int j = 1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         //inner loop -> star print
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5 
    // public static void main(String[] args) {
    //     int n=5;
    //     for (int i = 1; i<=n; i++) {
    //         for (int j = 1; j<=i; j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }



    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 
    // public static void main(String[] args) {
    //     int n=5;
    //     for (int i = n; i>0; i--) {
    //         for (int j = 1; j<=i; j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }



    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15 
    // public static void main(String[] args) {
    //     int n=5;
    //     int num = 1;
    //     for (int i = 1; i <=n; i++) {
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(num+" ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }



    // 1 
    // 0  1 
    // 1  0  1 
    // 0  1  0  1 
    // 1  0  1  0  1 
    public static void main(String[] args) {
       int n=5;
       for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=i; j++) {
            int sum=i+j;
               if(sum%2==0) System.out.print(" 1 "); //even
               else System.out.print(" 0 "); //odd
           }
           System.out.println();
       }
    }


}
