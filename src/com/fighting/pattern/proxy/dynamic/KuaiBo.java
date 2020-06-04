package com.fighting.pattern.proxy.dynamic;


/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class KuaiBo implements Application {
    @Override
    public void watchMovie() {
        System.out.println("使用快播看小电影。");
    }

    @Override
    public void downloadMovie(String movie) {
        System.out.println("下载" + movie);
    }
}
