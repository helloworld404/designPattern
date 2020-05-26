package com.fighting.pattern.builder;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:25
*/
public interface ComputerBuilder {

    public void buildCpu();
    public void buildRam();
    public void buildHdd();
    public Computer buildComputer();

}
