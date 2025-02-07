import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FooConcurrency {

    public static void main(String args[]) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            if (n > 1) {
                TaskFooBar tfb = new TaskFooBar(n);

                FooThread ft = new FooThread(tfb);
                BarThread bt = new BarThread(tfb);

                ExecutorService ex = Executors.newFixedThreadPool(2);
                ex.submit(ft);
                ex.submit(bt);
            }
        } else {
            System.out.println("No Input");
        }
    }
}
