package com.fighting.pattern.factory.abstractFactory;

public class HuaWeiFactory implements AbstractFactory{

    @Override
    public Phone makePhone() {
        return new HuaWeiPhone().make();
    }

    @Override
    public Computer makeComputer() {
        return new HuaWeiComputer().make();
    }
}
