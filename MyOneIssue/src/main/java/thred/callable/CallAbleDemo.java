package thred.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallAbleDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        FutureTask futureTask = new FutureTask(new MyThread());
        Thread t1 = new Thread(futureTask,"AAA");
        t1.start();
        System.out.println("************"+futureTask.get());
    }
}
class MyThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(" come in call ");
        return 1024;
    }
}