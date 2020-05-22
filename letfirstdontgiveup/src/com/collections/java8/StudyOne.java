package com.collections.java8;

import javax.crypto.spec.PSource;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudyOne {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("打印");

    }

    public void test1(){
        //无参数结构
        //作为接口的实例  () -> System.out.println("打印");
        Runnable runnable = () -> System.out.println("打印");
    }


    void test2(){
        //原始结构
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };
        con.accept("aasdsd");
        //有参数 无返回值 结构
        Consumer<String> con2 = (String s) ->{
            System.out.println(0);
        };
        con2.accept("hahahh");

        //参数可不写类型  有类型推断
        Consumer con3 = (s) ->{
            System.out.println(0);
        };
        con3.accept(1);

        //只有一个参数的时候小括号也可以 省略
        Consumer con4= s ->{
            System.out.println(0);
        };
        con4.accept(1);

    }

    void test3(){
// 有多个参数和返回值
        //原始写法
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                System.out.println(i1);
                System.out.println(i2);
                return i1.compareTo(i2);
            }
        };
        System.out.println("*******************");
        // lam 写法
        Comparator<Integer> comparator1 = (i1,i2) ->{
            System.out.println(i1);
            System.out.println(i2);
            return i1.compareTo(i2);
        };

        System.out.println(comparator1.compare(1,4));

        //只有一条执行语句 大括号也可以省略
        Comparator<Integer> comparator2= (i1,i2) -> i1.compareTo(i2);

        //
        Consumer con4= s -> System.out.println(0);
        con4.accept(1);
    }

    public void test121(){
        // 内置的四大函数式接口
        //消费性接口
        Consumer com = (s)->{
        };
        com.accept("s");

        // 供给型接口  提供返回值
        Supplier supplier = ()->{
          return "asdsd";
        };
        Supplier supplier2 = ()-> 1;

        //函数型接口
        Function function = (d)->{

        return d;
        };
        function.apply("d");

        // 判断行接口 返回boolean 类型 值

        Predicate predicate = (s)->{
            return s.equals("a");
        };
        boolean a = predicate.test("a");


    }
}

