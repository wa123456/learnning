package com.lv.lambda;

/**
 * @program: learnning
 * @description: 学习lambda
 * @author: Lv
 * @create: 2020-01-11 15:12
 **/
public class Test {
    public static void main(String[] args) {

        // 1.1使用匿名内部类
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        // 1.2使用 lambda 获得Runnable接口对象
        new Thread(() -> System.out.println("Hello world !")).start();
        */
//=============================================================================
        /**/
        // 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // 2.2使用 lambda直接获得接口对象
        Runnable race2 = () -> System.out.println("Hello world !");

        // 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();

    }
}
