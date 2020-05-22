package queue.blockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueue {
    public ArrayBlockingQueue(int i) {

    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new java.util.concurrent.ArrayBlockingQueue(3);
        blockingQueue.add(2);
        blockingQueue.add(5);
        blockingQueue.add(3);

        System.out.println(blockingQueue.peek());

    }
}
