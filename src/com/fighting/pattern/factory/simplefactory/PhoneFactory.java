package com.fighting.pattern.factory.simplefactory;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
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
