package com.fighting.pattern.factory.abstractFactory;

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
