package com.example.designmodel.singleton;

/**
 * Created by Administrator on 2018/5/4 0004.
 * 饿汉式单例模式
 */
public class Singleton3 {

    private Singleton3(){}

    private static Singleton3 instance = new Singleton3();

    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
