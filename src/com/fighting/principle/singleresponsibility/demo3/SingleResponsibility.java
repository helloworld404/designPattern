package com.fighting.principle.singleresponsibility.demo3;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/26 0:56
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}
