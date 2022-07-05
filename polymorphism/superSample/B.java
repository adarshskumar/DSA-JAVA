package polymorphism.superSample;

public class B extends A{
    int a;

    B(){
        System.out.println("It's B constructor");
    }

    B(int a){
        super(10);
        System.out.println("It's Arguemnt constructor of B");
    }

    // B(){
    //     System.out.println();
    // }

    void display(){

        System.out.println("It's B");

        a=20;

        super.a=30;

        int c=super.a+a;

        System.out.println(c);

        // super.display();
    }

    void baseDisplay(){
        super.display();
    }

    public static void main(String[] args) {
        B b=new B(10);
        //for arg constructot call super(); in Base class constructor with arg

        // b.display(); 
        // b.baseDisplay();


    }
}
