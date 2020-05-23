package com.fighting.principle.ocp.demo2;


/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/19 22:21
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}
