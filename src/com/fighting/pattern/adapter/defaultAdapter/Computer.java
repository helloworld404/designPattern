package com.fighting.pattern.adapter.defaultAdapter;

/**
 * @Description
 * @Author LiuXing
 * @Date 2020/05/26 23:37
 */
public class Computer {
    private USB usb;

    public void setUSB(USB usb){
        this.usb = usb;
    }

    public void charge() {
        usb.charge();
    }

    public void transferFiles() {
        usb.transferFiles();
    }

    public void keyboard() {
        usb.keyboard();
    }

    public void mouse() {
        usb.mouse();
    }

}
