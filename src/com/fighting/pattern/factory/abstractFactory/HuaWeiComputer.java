package com.fighting.pattern.factory.abstractFactory;

public class HuaWeiComputer implements Computer {

    public HuaWeiComputer(){}
    public HuaWeiComputer(String cpuType){
        System.out.println("制造华为笔记本：" + cpuType);
    }

    @Override
    public Computer make() {
        return new HuaWeiComputer("麒麟");
    }
}
