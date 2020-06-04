package com.fighting.pattern.proxy.staticproxy;

/**
 * @Description 静态代理模式
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        KuaiBo kuaiBo = new KuaiBo();
        KuaiBoInk kuaiBoInk = new KuaiBoInk(kuaiBo);
        kuaiBoInk.watchMovie();
    }
}
