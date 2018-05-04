package com.example.designmodel.singleton;

/**
 * Created by Administrator on 2018/5/4 0004.
 * 懒汉式单例
 */
public class Singleton {
    // 全局唯一实例
    private static Singleton instance;

    // 一个私有的构建方法，防止外部手动new实例
    private Singleton(){}

    //公开的获取手柄
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
