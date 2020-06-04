package com.fighting.pattern.bridge;
/**
* @Description 抽象类
* @Author: LiuXing
* @Date: 2020/5/28 21:31
*/
public abstract class DriveManager {
    public Drive drive;

    public void setDrive(Drive drive){
        this.drive = drive;
    }

    public abstract void buildConnect();
}
