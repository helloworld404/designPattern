package com.fighting.pattern.builder;
/**
* @Description 建造者模式测试
* @Author: LiuXing
* @Date: 2020/5/26 22:57
*/
public class BulidTest {

    public static void main(String[] args) {
        ComputerBuilder builder = new HaseeBuilder();
        Director director = new Director(builder);
        Computer computer = director.construct();

        computer.showInfo();
    }
}
