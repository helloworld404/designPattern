package com.fighting.pattern.bridge;

/**
* @Description 扩充抽象类：C++
* @Author: LiuXing
* @Date: 2020/5/28 21:31
*/
public class CPlusDBConnect extends DriveManager {
    @Override
    public void buildConnect() {
        drive.buildDrive("C++");
    }
}
