package com.fighting.pattern.bridge;

/**
 * @Description 桥接模式测试
 * @Author: LiuXing
 * @Date: 2020/5/28 21:31
 */
public class BridgeTest {

    public static void main(String[] args) {
        Drive mysqlDrive = new MysqlDrive();

        JAVADBConnect javadbConnect = new JAVADBConnect();
        javadbConnect.setDrive(mysqlDrive);
        javadbConnect.buildConnect();
    }
}
