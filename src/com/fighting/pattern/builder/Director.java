package com.fighting.pattern.builder;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:31
*/
public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
     this.builder = builder;
    }

    public Computer construct(){
        builder.buildCpu();
        builder.buildRam();
        builder.buildHdd();
        return builder.buildComputer();
    }

}
