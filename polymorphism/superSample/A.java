package polymorphism.superSample;

public class A {
    int a;

    A(){
        System.out.println("It's A constructor");
    }

    void display(){
        System.out.println("It's A");
    }

    A(int a){
        System.out.println("It's arguemnt constructor of A");
    }
}
