import java.util.Scanner;

public class fnSample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int result=sum(num1,num2);

        System.out.println("Result:"+result);
        sc.close();
    }

    static int sum(int a,int b){
        int s=a+b;
        return s;
    }
}