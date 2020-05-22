package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MoreCondition {

    private int num = 1; //  012 abc
    private Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void print5 (){
        lock.lock();
        try{
            while(num != 0){
                condition1.await();
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println("AAA555");
            }
            //操作完成后 加一下一个
            num = 1;
            condition2.signal();
        }catch(Exception e){

        }finally{
        lock.unlock();
        }
    }

    public void print10 (){
        lock.lock();
        try{
            while(num != 1){
                condition1.await();
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println("AAA555");
            }
            //操作完成后 加一下一个
            num = 2;
            condition3.signal();
        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }

    public void print15(){
        lock.lock();
        try{
            while(num != 2){
                condition1.await();
            }
            for (int i = 0; i <15 ; i++) {
                System.out.println("AAA555");
            }
            //操作完成后 加一下一个
            num = 0;
            condition1.signal();
        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        while (true){}
    }

}
