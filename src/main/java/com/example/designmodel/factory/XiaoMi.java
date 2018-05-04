package com.example.designmodel.factory;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class XiaoMi implements PhoneMaker {
    @Override
    public void makePhone() {
        System.out.println("制造小米手机");
    }
}
