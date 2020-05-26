package com.fighting.pattern.builder;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:25
*/
public class ThinkPadBuilder implements ComputerBuilder {

    private Computer computer;
    public ThinkPadBuilder(){
        computer = new Computer();
    }
    @Override
    public void buildCpu() {
        computer.setCpu("Inter U系列");
    }

    @Override
    public void buildRam() {
        computer.setRam("三星8G");
    }

    @Override
    public void buildHdd() {
        computer.setHdd("希捷500G");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
