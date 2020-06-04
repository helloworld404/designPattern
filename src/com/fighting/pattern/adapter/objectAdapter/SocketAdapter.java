package com.fighting.pattern.adapter.objectAdapter;

/**
* @Description 适配器
* @Author: LiuXing
* @Date: 2020/5/26 23:37
*/
public class SocketAdapter implements ChinaSocketInterface {

    //不再继承而是持有引用
    private ItalySocket socket;

    public SocketAdapter (ItalySocket socket) {
        this.socket = socket;
    }

    @Override
    public void chargeByTwoRectangle() {
        this.socket.chargeByTwoRound();
    }
}
