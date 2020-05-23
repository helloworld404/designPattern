package com.fighting.pattern.factory.factorymethod;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new XiaoMiPhone().make();
    }
}
