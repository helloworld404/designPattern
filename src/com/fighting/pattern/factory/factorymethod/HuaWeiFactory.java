package com.fighting.pattern.factory.factorymethod;

public class HuaWeiFactory implements AbstractFactory{

    @Override
    public Phone makePhone() {
        return new HuaWeiPhone().make();
    }
}
