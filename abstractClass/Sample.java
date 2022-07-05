package abstractClass;

public class Sample extends Hello {

    @Override
    void onText(String text) {
        System.out.println(text);
        
    }

    Sample(){
        TextScanner ts= new TextScanner(this); //this-current obj
        ts.scan();
    }

    public static void main(String[] args) {

        Sample s= new Sample();
        
    }

    
}
