package com.fighting.pattern.factory.simplefactory;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if("XiaoMi".equalsIgnoreCase(phoneType)){
            return new XiaoMiPhone().make();
        }
        else if("HuaWei".equalsIgnoreCase(phoneType)) {
            return new HuaWeiPhone().make();
        }
        return null;
    }
}
