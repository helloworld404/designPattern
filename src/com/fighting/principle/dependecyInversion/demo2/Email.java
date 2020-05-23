package com.fighting.principle.dependecyInversion.demo2;

public class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello email";
    }
}
