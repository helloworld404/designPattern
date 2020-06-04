package com.fighting.pattern.template;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class OWL extends Person {
    @Override
    void wakeup() {
        System.out.println("睡成死猪一样");
    }

    @Override
    void breakfast() {
        System.out.println("早餐是什么味道？");
    }

    @Override
    public void work() {
        System.out.println("摸鱼+划水+带薪拉屎");
    }

    @Override
    public void offwork() {
        System.out.println("溜了溜了");
    }

    @Override
    public void sleep() {
        System.out.println("多人运动。");
    }
}
