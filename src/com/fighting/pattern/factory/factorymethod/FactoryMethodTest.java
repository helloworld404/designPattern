package com.fighting.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        AbstractFactory xiaomiFactory = new XiaoMiFactory();
        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        Phone xiaomiPhone = xiaomiFactory.makePhone();
        Phone huaweiPhone = huaWeiFactory.makePhone();
    }
}
