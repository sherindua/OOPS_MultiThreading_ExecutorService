import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args){
        System.out.println("Hi from "+ Thread.currentThread().getName());
        ExecutorService es=Executors.newFixedThreadPool(10);
        NumberPrinter np=new NumberPrinter();

        for(int i=1;i<=100;i++){
        es.submit(np);
        }

        System.out.println("Bye1 from "+ Thread.currentThread().getName() );
        System.out.println("Bye2 from "+ Thread.currentThread().getName() );
        for(int i=0;i<10;i++){
            System.out.println("MainLoop "+i);
        }
        es.shutdown();

    }
}
