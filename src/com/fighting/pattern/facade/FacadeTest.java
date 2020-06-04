package com.fighting.pattern.facade;

/**
 * @Description 外观模式
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.download();
        computer.music();
    }
}
