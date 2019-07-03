package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:38
 * @since
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

}
