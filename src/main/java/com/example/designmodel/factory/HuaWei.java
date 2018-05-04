package com.example.designmodel.factory;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class HuaWei implements PhoneMaker {
    @Override
    public void makePhone() {
        System.out.println("制造华为手机");
    }
}
