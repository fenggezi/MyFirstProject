package thred;

import java.util.concurrent.Semaphore;

/**
 * 这个是顺序输出  线程  123  123  执行不同的方法
 */
public class OrderThreadPrint {
    private Semaphore semaphore =  new Semaphore(0);
    private Semaphore semaphore2 =  new Semaphore(0);


    public void one(){
        System.out.println(Thread.currentThread().getName()+"顺序输出的线程几  + method one");
        semaphore.release();
    }
    public void two(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"顺序输出的线程几 + method two ");
        semaphore2.release();

    }
    public void three(){
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"顺序输出的线程几 = method three ");

    }

    public static void main(String[] args) {
        OrderThreadPrint orderThreadPrint = new OrderThreadPrint();
        new Thread(()->{
            orderThreadPrint.one();
        },"线程1");

        new Thread(()->{
            orderThreadPrint.two();
        },"线程2");

        new Thread(()->{
            orderThreadPrint.three();
        },"线程3");
    }
}
