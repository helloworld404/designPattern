package com.fighting.pattern.decorator;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Phone xiaomiPhone = new XiaoMiPhone();
        PhoneDecorator xiaomiPhoneP = new WeChatCallDecorator(new XiaoMiPhone());
        PhoneDecorator huaWeiPhoneP = new WeChatCallDecorator(new HuaWeiPhone());

        xiaomiPhone.call();
        xiaomiPhoneP.call();
        huaWeiPhoneP.call();

    }
}
