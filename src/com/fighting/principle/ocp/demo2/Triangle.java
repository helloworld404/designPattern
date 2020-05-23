package com.fighting.principle.ocp.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/20 0:01
 */
public class Triangle extends Shape {
    Triangle() {
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}
