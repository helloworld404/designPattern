package com.fighting.pattern.factory.factorymethod;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class HuaWeiPhone implements Phone {

    public HuaWeiPhone(){}

    public HuaWeiPhone(String cpuType){
        System.out.println("制造华为手机：" + cpuType);
    }
    
    @Override
    public Phone make() {
        return new HuaWeiPhone("麒麟");
    }
}
