package com.fighting.pattern.adapter.objectAdapter;

/**
* @Description 对象适配器模式
* @Author: LiuXing
* @Date: 2020/5/26 23:32
*/
public class SocketInterfaceTest {
    public static void main(String[] args) {
        ChineseJD chineseJD = new ChineseJD();
        chineseJD.charge(new SocketAdapter(new ItalySocket()));
    }
}
