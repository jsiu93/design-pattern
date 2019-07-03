package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:53
 * @since
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.01 + this.beverage.cost();
    }
}
