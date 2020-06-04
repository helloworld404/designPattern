package com.fighting.pattern.facade;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class RAM {

    private RAM(){}

    private static class SingletonInstance{
        private static final com.fighting.pattern.facade.RAM RAM = new RAM();
    }

    public static RAM getInstance(){
        return SingletonInstance.RAM;
    }

    public void read(){
        System.out.println("读取内存");
    }

    public void write(){
        System.out.println("写入内存");
    }


}
