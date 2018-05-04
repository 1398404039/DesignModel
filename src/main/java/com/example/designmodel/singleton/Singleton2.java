package com.example.designmodel.singleton;

/**
 * Created by Administrator on 2018/5/4 0004.
 * 静态内部类
 */
public class Singleton2 {
    private Singleton2(){}

    public static final Singleton2 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}
