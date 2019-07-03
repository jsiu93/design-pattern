package com.xzh.designpattern.adapter;

/**
 * @author jsiu
 * @description
 * @date 2019-07-03 15:42
 * @since
 */
public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
