package com.fighting.pattern.template;

/**
 * @Description
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public abstract class Person {

    final void daily(){
        wakeup();
        breakfast();
        work();
        offwork();
        sleep();
    }

    abstract  void wakeup();
    abstract void breakfast();
    public abstract void work();
    public abstract void offwork();
    public abstract void sleep();



}
