package com.fighting.principle.segregation.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:49
 */
public class D implements Interface, Interface3 {
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
