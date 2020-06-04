package com.fighting.pattern.observer;
/**
 * @Description 观察者接口
 * @Author: LiuXing
 * @Date: 2020/5/26 23:25
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
