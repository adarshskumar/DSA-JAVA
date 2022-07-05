import java.util.Scanner;

public class sample {
    public static void main(String ar[]){

        // int a=10;

        System.out.println("Enter a number");

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        int c=a+b;

        System.out.println(a+" " + b + "\nsum = " +c);
        s.close();
    }
}
