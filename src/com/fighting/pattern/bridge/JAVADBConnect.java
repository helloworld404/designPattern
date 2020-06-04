package com.fighting.pattern.bridge;
/**
* @Description 扩充抽象类：JAVA
* @Author: LiuXing
* @Date: 2020/5/28 21:31
*/
public class JAVADBConnect extends DriveManager {
    @Override
    public void buildConnect() {
        drive.buildDrive("JAVA");
    }
}
