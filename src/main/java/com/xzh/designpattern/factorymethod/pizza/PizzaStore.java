package com.xzh.designpattern.factorymethod.pizza;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 14:47
 * @since
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
