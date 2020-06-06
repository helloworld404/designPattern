package com.fighting.pattern.decorator;

/**
 * @Description 小米手机有打电话功能
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机可以打电话。");
    }
}
