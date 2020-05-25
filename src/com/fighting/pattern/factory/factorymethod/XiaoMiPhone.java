package com.fighting.pattern.factory.factorymethod;

public class XiaoMiPhone implements Phone {

    public XiaoMiPhone(){}

    private XiaoMiPhone(String cpuType){
        System.out.println("制造小米手机：" + cpuType);
    }

    @Override
    public Phone make() {
        return new XiaoMiPhone("骁龙");
    }
}
