package com.xzh.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Authur: joshuasiu
 * @Date: 2019-05-30 10:25
 * @Description:
 */
public class WechatServer implements Observable {

    private List<Observer> observers = new ArrayList<>();

    private String message;


    public void register(Observer observer) {
        observers.add(observer);

    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            System.out.println("通知观察者， message=" + this.message);
            observer.update(this.message);
        }

    }

    public void setMessage(String message) {
        this.message = message;
        System.err.println("更新信息， message=" + message);
        notifyObserver();
    }
}
