package com.fighting.segregation.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:48
 */
public class B implements Interface, Interface2 {
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}
