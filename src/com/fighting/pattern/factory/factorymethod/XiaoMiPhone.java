package com.fighting.pattern.factory.factorymethod;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
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
