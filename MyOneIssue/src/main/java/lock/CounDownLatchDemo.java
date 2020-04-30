package lock;

import java.util.concurrent.CountDownLatch;

public class CounDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);

//        for (int i = 0; i <6 ; i++) {
//            new Thread(() -> {
//                System.out.println("aaa");
//            },"aa").start();
//            System.out.println(i);
//        }//等待上面的完成 才执行下面这一个  就是让一些线程阻塞 当前线程完成才让其他的执行
//        countDownLatch.countDown();
//        System.out.println("上面完成");
    }
}
