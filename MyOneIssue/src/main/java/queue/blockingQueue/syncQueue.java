package queue.blockingQueue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class syncQueue { // 同步队列不存储
    public static void main(String[] args)  {
        SynchronousQueue synchronousQueue = new SynchronousQueue(); // 插入一个消费一个  不消费不插入
        try {
            synchronousQueue.put("1");
            System.out.println("put one ");
            synchronousQueue.put("2");
            synchronousQueue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() ->{
            try {
                TimeUnit.SECONDS.sleep(5);
                Object take = synchronousQueue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });
    }
}
