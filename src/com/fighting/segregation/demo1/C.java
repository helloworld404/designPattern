package com.fighting.segregation.demo1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:42
 */
public class C { //C 类通过接口 Interface1 依赖(使用) D 类，但是只会用到 1,4,5 方法
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend4(Interface i) {
        i.operation4();
    }

    public void depend5(Interface i) {
        i.operation5();
    }
}
