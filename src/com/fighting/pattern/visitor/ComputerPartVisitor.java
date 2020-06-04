package com.fighting.pattern.visitor;

/**
 * @Description 访问者接口
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
