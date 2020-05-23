package com.fighting.principle.segregation.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:50
 */
public class A {  // A 类通过接口 Interface1,Interface2 依赖(使用) B 类，但是只会用到 1,2,3 方法
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}