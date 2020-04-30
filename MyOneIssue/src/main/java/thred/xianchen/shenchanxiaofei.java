package thred.xianchen;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class shenchanxiaofei {

    private int numbe =0 ;
    ReentrantLock lock =new ReentrantLock();
    Condition condition = lock.newCondition();
    public void  increment(){
        lock.lock();
        try {
            while(numbe!=0){
                condition.await();// 等待 不能生产
            }
            numbe++;
            System.out.println(Thread.currentThread().getName() + numbe);
            condition.signalAll();//唤醒

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }


    public void  deIncrement(){
        lock.lock();
        try {
            while(numbe == 0){
                condition.await();// 等待 不能消费
            }
            numbe--;
            System.out.println(Thread.currentThread().getName() + numbe);
            condition.signalAll();//唤醒

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        shenchanxiaofei sh = new shenchanxiaofei();

        new Thread(()->{
            sh.increment();
        },"Thread 1");
        new Thread(()->{
            sh.increment();
        },"Thread 2");
        new Thread(()->{
            sh.deIncrement();
        },"Thread 3");
        new Thread(()->{
            sh.deIncrement();
        },"Thread 4");
    }

}


