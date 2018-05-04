package com.example.designmodel.factory;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class PhoneClient {
    public static void main(String[] args){
        PhoneFactory phoneFactory = new PhoneFactory();

        PhoneMaker phone = phoneFactory.makePhone(PhoneTypeConstant.HUAWEI);
        phone.makePhone();

        PhoneMaker phone1 = phoneFactory.makePhone(PhoneTypeConstant.IPHONE);
        phone1.makePhone();

        PhoneMaker phone2 = phoneFactory.makePhone(PhoneTypeConstant.XIAOMI);
        phone2.makePhone();
    }
}
