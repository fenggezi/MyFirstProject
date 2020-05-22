package com.collections.java8;

public class FunctionnalInterfaceMY {
    public static void main(String[] args) {

        //自定义函数时接口 在接口上添加Function Interface来定义函数式接口

        MyInterface my = () -> System.out.println("test");

    }
}
