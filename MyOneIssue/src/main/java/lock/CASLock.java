package lock;

import java.util.concurrent.atomic.AtomicReference;

public class CASLock {
    AtomicReference<Thread> atomicReference = new AtomicReference();

    public void lock(){
        Thread thread = Thread.currentThread();

        while(!atomicReference.compareAndSet(null,thread)){// 和期望值比较 如果不是期望值 就自旋
            //不是期望值  就一直获取 直到获取到锁
        }
        System.out.println("是期望值");
    }

    public  void unLock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);//释放锁
        System.out.println("释放锁");
    }
}
