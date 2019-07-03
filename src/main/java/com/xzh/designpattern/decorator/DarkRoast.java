package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:32
 * @since
 */
public class DarkRoast extends  Beverage {

    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
