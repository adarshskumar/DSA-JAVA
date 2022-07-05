import java.util.Scanner;

// package sample;

class HelloSample{
    public static void main(String ar[]){
        

        Scanner s=new Scanner(System.in);

        System.out.println("Enter 2 numbers");


        int a=s.nextInt();
        int b=s.nextInt();

        int c=a+b;

        System.out.println("Result:"+c);

        s.close();
    }
}