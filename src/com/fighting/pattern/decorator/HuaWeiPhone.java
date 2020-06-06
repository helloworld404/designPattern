package com.fighting.pattern.decorator;

/**
 * @Description 华为手机有打电话功能
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机可以打电话。");
    }
}
