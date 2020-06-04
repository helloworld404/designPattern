package com.fighting.pattern.command;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/28 21:32
*/
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
