package com.fighting.pattern.command;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public interface Command {
    //执行动作(操作)
    public void execute();
    // 撤销动作(操作)
    public void undo();

}
