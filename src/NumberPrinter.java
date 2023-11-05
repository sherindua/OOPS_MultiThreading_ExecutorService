import java.sql.SQLOutput;

public class NumberPrinter implements Runnable{
    int n=0;
    public void run(){
        System.out.println(n++ + "from "+ Thread.currentThread().getName());
    }
}
