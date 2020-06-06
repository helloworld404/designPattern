package com.fighting.pattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Description 装饰者模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class DecoratorTest {

    public static void main(String[] args) throws Exception {
        Phone xiaomiPhone = new XiaoMiPhone();
        PhoneDecorator xiaomiPhoneP = new WeChatCallDecorator(new XiaoMiPhone());
        PhoneDecorator huaWeiPhoneP = new WeChatCallDecorator(new HuaWeiPhone());

        xiaomiPhone.call();
        xiaomiPhoneP.call();
        huaWeiPhoneP.call();

        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\test.txt"));
        System.out.println(dis.read());
        dis.close();

    }
}
