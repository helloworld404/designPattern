package com.fighting.pattern.proxy.staticproxy;

/**
 * @Description 代理对象
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class KuaiBoInk implements Application {

    private Application app;

    public KuaiBoInk(Application app){
        this.app = app;
    }

    @Override
    public void watchMovie() {
        app.watchMovie();
    }
}
