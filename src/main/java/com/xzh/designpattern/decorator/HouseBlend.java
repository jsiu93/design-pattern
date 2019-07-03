package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:31
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
