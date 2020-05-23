package com.fighting.pattern.factory.simplefactory;

public class HuaWeiPhone implements Phone{

    public HuaWeiPhone(){}

    public HuaWeiPhone(String cpuType){
        System.out.println("制造华为手机：" + cpuType);
    }

    @Override
    public Phone make() {
        return new HuaWeiPhone("麒麟");
    }

}
