package com.fighting.segregation.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:52
 */
public class C {
    public void depend1(Interface i) {  // C 类通过接口 Interface1,Interface3 依赖(使用) D 类，但是只会用到 1,4,5 方法
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}
