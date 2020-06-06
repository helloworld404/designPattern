package com.fighting.pattern.flyweight;

/**
 * @Description 享元模式下JDK中的应用
 * @Author LiuXing
 * @Date 2020/06/06 19:28
 */
public class JDKTest {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer n = new Integer(127);

        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(n == x);
        System.out.println(n == y);

        ///如果 Integer.valueOf(x) x 在 -128 --- 127 直接，就是使用享元模式返回,如果不在范围内，就new一个
        //在 valueOf 方法中，先判断值是否在 IntegerCache 中，如果不在，就创建新的 Integer(new), 否则，就直接从缓存池返回

        Integer xx = Integer.valueOf(128);
        Integer yy = Integer.valueOf(128);
        System.out.println(xx == yy);
    }
}
