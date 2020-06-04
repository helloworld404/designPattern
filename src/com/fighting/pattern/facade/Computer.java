package com.fighting.pattern.facade;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class Computer {

    private CPU cpu;
    private RAM ram;
    private SSD ssd;

    public Computer(){
        cpu = CPU.getInstance();
        ram = RAM.getInstance();
        ssd = SSD.getInstance();
    }

    public void music(){
        System.out.println("music启动 嗨起来！");
        ssd.read();
        ram.write();
        ram.read();
        cpu.poweron();
    }

    public void download(){
        System.out.println("下载小电影?!");
        cpu.poweron();
        ram.write();
        ssd.write();
    }
}
