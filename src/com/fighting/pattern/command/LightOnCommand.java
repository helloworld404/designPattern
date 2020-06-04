package com.fighting.pattern.command;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
