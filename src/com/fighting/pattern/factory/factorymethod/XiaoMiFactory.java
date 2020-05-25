package com.fighting.pattern.factory.factorymethod;

public class XiaoMiFactory implements PhoneFactory{
    @Override
    public Phone makePhone() {
        return new XiaoMiPhone().make();
    }
}
