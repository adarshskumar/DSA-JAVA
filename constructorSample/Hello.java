package constructorSample;

public class Hello {
    public static void main(String[] args) {
        Sample s = new Sample();

        Hello h=new Hello(); 
    }

    Hello(){
        System.out.println("Hello constructor ");
    }
}
