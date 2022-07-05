package abstractClass;

public class TextScanner {
    Hello obj; //to make this object global

    public TextScanner(Hello obj){

        this.obj=obj;

    }

    void scan(){


         String text="Scanned Text";
        obj.onText(text);
    }
}
