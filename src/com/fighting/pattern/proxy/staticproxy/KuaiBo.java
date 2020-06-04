package com.fighting.pattern.proxy.staticproxy;

/**
 * @Description
 * @Author: LiuXing 被代理对象实体类
 * @Date: 2020/5/28 21:32
 */
public class KuaiBo implements Application {
    @Override
    public void watchMovie() {
        System.out.println("使用快播看小电影。");
    }
}
