package com.fighting.principle.singleresponsibility.demo1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/26 0:42
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
