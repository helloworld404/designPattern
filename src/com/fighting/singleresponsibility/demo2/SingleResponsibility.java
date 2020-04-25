package com.fighting.singleresponsibility.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/04/26 0:51
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
