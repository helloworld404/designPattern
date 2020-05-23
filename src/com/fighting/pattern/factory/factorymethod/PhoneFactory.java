package com.fighting.pattern.factory.factorymethod;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("XiaoMi")){
            return new XiaoMiPhone().make();
        }
        else if(phoneType.equalsIgnoreCase("HuaWei")) {
            return new HuaWeiPhone().make();
        }
        return null;
    }
}
