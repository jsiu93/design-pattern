package com.xzh.designpattern.adapter;

/**
 * @author jsiu
 * @description
 * @date 2019-07-03 15:43
 * @since
 */
public class ConcreteAdaptee implements Adaptee {

    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee.specificRequest");
    }
}
