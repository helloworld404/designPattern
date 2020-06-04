package com.fighting.pattern.proxy.dynamic;


/**
 * @Description 动态代理模式说
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Application kuaiBo = new KuaiBo();
        Application proxyInstance = (Application)new ProxyFactory(kuaiBo).getProxyInstance();
        //proxyInstance=classcom.sun.proxy.$Proxy0 内存中动态生成了代理对象 
        System.out.println("proxyInstance = " + proxyInstance.getClass());

        proxyInstance.downloadMovie("十六歳のロリ嬌羞初体験.avi");
        proxyInstance.watchMovie();
    }
}
