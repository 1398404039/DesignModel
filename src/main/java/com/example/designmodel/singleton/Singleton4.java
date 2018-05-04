package com.example.designmodel.singleton;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public enum Singleton4 {
    INSTANCE;

    private Singleton41 instance;

    Singleton4(){
        instance = new Singleton41();
    }

    public Singleton41 getInstance(){
        return instance;
    }
}

class Singleton41{

}
