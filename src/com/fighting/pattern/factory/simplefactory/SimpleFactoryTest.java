package com.fighting.pattern.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone xiaomi = factory.makePhone("XiaoMi");
        Phone huawei = factory.makePhone("HuaWei");
    }
}
