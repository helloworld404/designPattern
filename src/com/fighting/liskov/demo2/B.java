package com.fighting.liskov.demo2;

import com.fighting.liskov.demo1.A;

public class B extends Base {
    //如果 B 需要使用 A 类的方法,使用组合关系
    private A a = new A(); //这里，重写了 A 类的方法, 可能是无意识

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用 A 的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}

