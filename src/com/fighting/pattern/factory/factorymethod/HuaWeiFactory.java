package com.fighting.pattern.factory.factorymethod;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class HuaWeiFactory implements PhoneFactory {

    @Override
    public Phone makePhone() {
        return new HuaWeiPhone().make();
    }
}
