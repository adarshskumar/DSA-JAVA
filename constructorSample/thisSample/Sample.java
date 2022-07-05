package constructorSample.thisSample;

public class Sample {
    int a=100,b=200; //global variable
    Sample(int a,int b){ //local variable
        // int c=a+b;
        
        // this.a=a;
        // this.b=b;

        a=this.a;
        b=this.b;

        System.out.println(this.a+" "+this.b);

    }
}
