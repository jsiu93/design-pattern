package com.xzh.designpattern.observer;

/**
 * @Authur: joshuasiu
 * @Date: 2019-05-30 09:23
 * @Description:
 */
public interface Observable {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyObserver();


}
