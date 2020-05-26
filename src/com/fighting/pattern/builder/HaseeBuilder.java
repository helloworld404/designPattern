package com.fighting.pattern.builder;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:31
*/
public class HaseeBuilder implements ComputerBuilder {

    private Computer computer;
    public HaseeBuilder(){
        computer = new Computer();
    }
    @Override
    public void buildCpu() {
        computer.setCpu("Inter H系列");
    }

    @Override
    public void buildRam() {
        computer.setRam("金士顿16G");
    }

    @Override
    public void buildHdd() {
        computer.setHdd("希捷1T");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
