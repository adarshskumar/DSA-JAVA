import java.util.Scanner;

public class ifSample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number");

        int num = sc.nextInt();

        //if
        // if(num<0){
        //     System.out.println("Number is Negative");
        // } else {
        //     System.out.println("Positive");
        // }

        //for
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=i;
        }
        System.out.println("Result "+sum);
        sc.close();
    }
}
