package com.xzh.designpattern.observer;

/**
 * @Authur: joshuasiu
 * @Date: 2019-05-30 10:33
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();

        Observer zhangsan = new User("张三");
        Observer lisi = new User("李四");
        Observer wangwu = new User("王五");

        wechatServer.register(zhangsan);
        wechatServer.register(lisi);
        wechatServer.register(wangwu);


        wechatServer.setMessage("hello");


    }
}
