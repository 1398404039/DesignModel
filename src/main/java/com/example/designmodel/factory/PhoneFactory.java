package com.example.designmodel.factory;

import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class PhoneFactory {

    public PhoneMaker makePhone(String phoneType){
        if(PhoneTypeConstant.HUAWEI.equals(phoneType)){
            return new HuaWei();
        }

        if(PhoneTypeConstant.XIAOMI.equals(phoneType)){
            return new XiaoMi();
        }

        if(PhoneTypeConstant.IPHONE.equals(phoneType)){
            return new IPhone();
        }

        return null;
    }
}
