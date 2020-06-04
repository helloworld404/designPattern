package com.fighting.pattern.facade;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class SSD {

    private SSD(){}

    private abstract static class SingleInstance{
        private static final com.fighting.pattern.facade.SSD SSD = new SSD();
    }

    public static SSD getInstance(){
        return SingleInstance.SSD;
    }

    public void read(){
        System.out.println("读取磁盘。");
    }

    public void write(){
        System.out.println("写入磁盘。");
    }

}
