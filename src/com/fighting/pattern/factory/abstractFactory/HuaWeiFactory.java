package com.fighting.pattern.factory.abstractFactory;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class HuaWeiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new HuaWeiPhone().make();
    }

    @Override
    public Computer makeComputer() {
        return new HuaWeiComputer().make();
    }
}
