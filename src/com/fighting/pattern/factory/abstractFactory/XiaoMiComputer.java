package com.fighting.pattern.factory.abstractFactory;

public class XiaoMiComputer implements Computer {

    public XiaoMiComputer (){}
    public XiaoMiComputer (String cpuType){
        System.out.println("制造小米电脑：" + cpuType);
    }

    @Override
    public Computer make() {
        return new XiaoMiComputer("Inter");
    }
}
