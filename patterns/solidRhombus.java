package patterns;

public class solidRhombus {
      public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <=n; i++) {
            int sp=n-i;
            //spaces
            for (int j=1; j<=sp; j++) {
                 System.out.print(" ");
            }

            //star
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }

      
}
