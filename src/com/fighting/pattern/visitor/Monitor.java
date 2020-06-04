package com.fighting.pattern.visitor;

/**
 * @Description 被访问者的实体类
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
