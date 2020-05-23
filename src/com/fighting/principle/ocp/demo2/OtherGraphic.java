package com.fighting.principle.ocp.demo2;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/20 0:02
 */
public class OtherGraphic extends Shape {
    OtherGraphic() {
        super.type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}
