package com.fighting.pattern.factory.abstractFactory;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
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
