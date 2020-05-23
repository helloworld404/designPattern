package com.fighting.principle.ocp.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/19 23:59
 */
public class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}
