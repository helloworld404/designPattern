package com.fighting.pattern.factory.simplefactory;

/**
 * @Description 简单工厂模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone xiaomi = factory.makePhone("XiaoMi");
        Phone huawei = factory.makePhone("HuaWei");
    }
}
