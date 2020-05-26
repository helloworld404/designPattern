package com.fighting.pattern.adapter.classAdapter;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:26
*/
public class SocketInterfaceTest {

    public static void main(String[] args) {
        ChineseJD chineseJD = new ChineseJD();
        chineseJD.charge(new SocketAdapter());
    }
}
