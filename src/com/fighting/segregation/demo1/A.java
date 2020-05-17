package com.fighting.segregation.demo1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:40
 */
public class A { //A 类通过接口 Interface 依赖(使用) B 类，但是只会用到 1,2,3 方法
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend2(Interface i) {
        i.operation2();
    }

    public void depend3(Interface i) {
        i.operation3();
    }
}