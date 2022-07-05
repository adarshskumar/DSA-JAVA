package threadSample.RunnableInterface;

public class Hello {
    public static void main(String[] args) {

        SampleThread st=new SampleThread();
        SampleThread st2=new SampleThread();
        SampleThread st1=new SampleThread();

        Thread t= new Thread(st);
        t.start();

        Thread t1= new Thread(st1);
        t1.start();
        
        Thread t2= new Thread(st2);
        t2.start();

    }
}
