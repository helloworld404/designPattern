package com.fighting.pattern.bridge;
/**
* @Description 扩充抽象类：Python
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public class PythonDBConnect extends DriveManager {
    @Override
    public void buildConnect() {
        drive.buildDrive("Python");
    }
}
