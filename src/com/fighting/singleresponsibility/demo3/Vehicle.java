package com.fighting.singleresponsibility.demo3;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/26 0:55
 */
public class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中行....");
    }
}
