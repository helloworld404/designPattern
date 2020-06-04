package com.fighting.pattern.visitor;

/**
 * @Description 被访问者的接口
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
