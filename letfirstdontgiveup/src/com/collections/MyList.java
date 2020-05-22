package com.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        List<String> strings = Collections.synchronizedList(list);

        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            }).start();
        }
    }


    public void listMy(){
        /**
         * list 分为 arraylist  linkedlist vector
         */
        // 底层是数组结构组成  Object[]  不指定大小 初始默认是10  每次扩容的时候扩容为当前大小的1.5倍 arraylist 是线程不安全的
        // 再插入数据的时候会造成java.util.ConcurrentModificationException 并发修改异常

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            }).start();
        }

        //解决arraylist线程安全的方法
        List<String> strings = Collections.synchronizedList(list);

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(UUID.randomUUID().toString().substring(0,2));

    }
}
