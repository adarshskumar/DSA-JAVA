public class sampleClass {
    public static void main(String[] args) {
        cSample s1= new cSample();
        cSample s2= new cSample();

        s1.a=20;
        s2.a=50;
        s1.b=100;
        s2.b=200;


        s1.display();
        s2.display();
        // System.out.println("S1- a :"+s1.a+" S2- a:"+s2.a+" S1-b :"+s1.b);
    }
}

