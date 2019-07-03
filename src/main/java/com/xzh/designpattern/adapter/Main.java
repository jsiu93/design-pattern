package com.xzh.designpattern.adapter;

/**
 * @author jsiu
 * @description
 * @date 2019-07-03 15:43
 * @since
 */
public class Main {


    public static void main(String[] args) {
        ITarget target = new Adapter(new ConcreteAdaptee());
        target.request();
    }
}
