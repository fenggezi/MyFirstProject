package com.collections.java8;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test4Function {
    void t1(){
        //传统写法
        byProducts(500, new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("买了瓶水"+o);
            }
        });

        // lama
        byProducts(500,(money)-> System.out.println("买了瓶水"+money));
        byProducts(500,money-> System.out.println("买了瓶水"+money));
        byProducts(500,(money)->{
            System.out.println("买了瓶水"+money);
        });
    }
    public void byProducts(Integer money , Consumer consumer){
        consumer.accept(money);
    }



    void t2(){
        //传统写法
        List<String> strings = Arrays.asList("北京", "南京", "hahah", "hhahaasds");
        FilterLit(strings, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        //
        FilterLit(strings,s-> s.contains("京"));

    }

    public List<String> FilterLit(List<String> list , Predicate<String> predicate){
        ArrayList arrayList =new ArrayList();
        for (String s : list){
            if(predicate.test(s)){
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    void test3(){

    }
}
