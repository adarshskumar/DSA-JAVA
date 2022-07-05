package patterns;

public class palindromePattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {

            //first half
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //numbers from i to 1
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }

            //2nd half
            //numbers from 2 to n
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }



            System.out.println();
        }
    }
}

