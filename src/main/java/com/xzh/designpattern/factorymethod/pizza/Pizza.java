package com.xzh.designpattern.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 14:49
 * @since
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Pizza.prepare... " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
