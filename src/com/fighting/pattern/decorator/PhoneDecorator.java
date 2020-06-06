package com.fighting.pattern.decorator;

/**
 * @Description 抽象角色，不实现任何功能
 * @Author: LiuXing
 * @Date: 2020/5/28 21:32
 */
public abstract class PhoneDecorator implements Phone{
    protected Phone phone;

    public PhoneDecorator(Phone phone){
        this.phone = phone;
    }

    public void call(){
        phone.call();
    }
}
