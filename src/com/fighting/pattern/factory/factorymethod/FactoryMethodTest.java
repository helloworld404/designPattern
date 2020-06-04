package com.fighting.pattern.factory.factorymethod;

/**
 * @Description 工厂方法模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        PhoneFactory xiaomiFactory = new XiaoMiFactory();
        PhoneFactory huaWeiFactory = new HuaWeiFactory();
        Phone xiaomiPhone = xiaomiFactory.makePhone();
        Phone huaweiPhone = huaWeiFactory.makePhone();
    }
}
