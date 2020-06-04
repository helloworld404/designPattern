package com.fighting.pattern.template;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class Ordinary extends Person {
    @Override
    void wakeup() {
        System.out.println("早上七点醒来");
    }

    @Override
    void breakfast() {
        System.out.println("吃点包子喝点粥。");
    }

    @Override
    public void work() {
        System.out.println("干干干干干干干干干干干干");
    }

    @Override
    public void offwork() {
        System.out.println("再加会班");
    }

    @Override
    public void sleep() {
        System.out.println("睡成死猪一样");
    }
}
