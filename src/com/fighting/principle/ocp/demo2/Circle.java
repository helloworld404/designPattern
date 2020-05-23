package com.fighting.principle.ocp.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/20 0:00
 */
public class Circle extends Shape {
    Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}
