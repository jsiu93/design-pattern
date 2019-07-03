package com.xzh.designpattern.observer;

/**
 * @Authur: joshuasiu
 * @Date: 2019-05-30 10:32
 * @Description:
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public void update(String message) {

        this.message = message;
        read();

    }

    private void read() {
        System.err.println(name + "收到消息 " + message);

    }
}
