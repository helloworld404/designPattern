package com.fighting.pattern.decorator;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class WeChatCallDecorator extends PhoneDecorator {

    public WeChatCallDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        phone.call();
        weChatCall(phone);
    }

    public void weChatCall(Phone phone){
        System.out.println("手机可以微信打电话了");
    }
}
