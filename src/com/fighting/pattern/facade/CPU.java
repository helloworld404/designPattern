package com.fighting.pattern.facade;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class CPU {

    private static CPU cpu;

    private CPU(){}

    public static synchronized CPU getInstance(){
        if (cpu == null){
            synchronized (CPU.class){
                if (cpu == null){
                    cpu = new CPU();
                }
            }
        }
        return cpu;
    }

    public void poweron(){
        System.out.println("调用CPU");
    }

}
