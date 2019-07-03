package com.xzh.designpattern.factorymethod.pizza;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 14:50
 * @since
 */
public class NYPizza extends Pizza {

    public NYPizza() {
        this.name = "NY Style pizza";
        this.dough = "thin crust dough";
        this.sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
