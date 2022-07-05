package inheritance.constructorVsInheritance;

public class B extends A{
    B(){
        System.out.println("It's consgtructor of B");
    }

    public static void main(String[] args) {
        B b=new B();
    }
}

//first run base class then runs child class. 
