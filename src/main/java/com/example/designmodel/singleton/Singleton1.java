package com.example.designmodel.singleton;

/**
 * Created by Administrator on 2018/5/4 0004.
 * 双重检查锁
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(instance == null){
            synchronized (Singleton1.class){
                if(instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
