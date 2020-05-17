package com.fighting.segregation.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/27 0:46
 */
public class Segregation {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); // A 类通过接口去依赖 B 类
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D()); // C 类通过接口去依赖(使用)D 类
        c.depend4(new D());
        c.depend5(new D());
    }
}
