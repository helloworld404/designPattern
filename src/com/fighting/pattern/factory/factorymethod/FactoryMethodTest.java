package com.fighting.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        PhoneFactory xiaomiFactory = new XiaoMiFactory();
        PhoneFactory huaWeiFactory = new HuaWeiFactory();
        Phone xiaomiPhone = xiaomiFactory.makePhone();
        Phone huaweiPhone = huaWeiFactory.makePhone();
    }
}
