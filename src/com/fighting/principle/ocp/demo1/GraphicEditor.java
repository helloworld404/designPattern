package com.fighting.principle.ocp.demo1;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/19 23:42
 */
public class GraphicEditor {

    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.type == 1) drawRectangle(s);
        else if (s.type == 2) drawCircle(s);
        else if (s.type == 3) drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形 ");
    }
}
