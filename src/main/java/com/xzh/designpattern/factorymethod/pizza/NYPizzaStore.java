package com.xzh.designpattern.factorymethod.pizza;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 14:50
 * @since
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYPizza();
        }
        throw new RuntimeException("no such type of pizza");
    }
}
