public class staticSample {

    int a=10;
    static int b;
    public static void main(String[] args) {
        staticSample obj=new staticSample();
        staticSample obj1=new staticSample();
        // System.out.println(a);
        obj.hello();
        hey();
        obj.hey();
        obj.a=50;
        // a=50;

        obj.a=100;
        obj1.a=200;

        System.out.println("obj.a:"+obj1.a);


        obj.b=10;

        // b=15;

        obj1.b=20;

        System.out.println("obj.b:"+obj.b);
    }

    void hello(){

    }

    static void hey(){

    }
}
