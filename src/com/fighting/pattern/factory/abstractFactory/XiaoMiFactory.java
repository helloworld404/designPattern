package com.fighting.pattern.factory.abstractFactory;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new XiaoMiPhone().make();
    }

    @Override
    public Computer makeComputer() {
        return new XiaoMiComputer().make();
    }
}
