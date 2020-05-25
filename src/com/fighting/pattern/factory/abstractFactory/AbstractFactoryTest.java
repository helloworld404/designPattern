package com.fighting.pattern.factory.abstractFactory;
/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/23 21:08
*/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        Phone xiaoMiPhone = xiaoMiFactory.makePhone();
        Computer xiaoMicomputer = xiaoMiFactory.makeComputer();

        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        Phone huaweiPhone = huaWeiFactory.makePhone();
        Computer huaWeiComputer = huaWeiFactory.makeComputer();

    }

}
