package com.fighting.pattern.adapter.classAdapter;

/**
* @Description 
* @Author: LiuXing
* @Date: 2020/5/26 23:26
*/
public class SocketAdapter extends ItalySocket implements ChinaSocketInterface{

    @Override
    public void chargeByTwoRectangle() {
        this.chargeByTwoRound();
    }

}
