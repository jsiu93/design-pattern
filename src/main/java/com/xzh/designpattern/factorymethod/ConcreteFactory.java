package com.xzh.designpattern.factorymethod;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 10:56
 * @since
 */
public class ConcreteFactory extends Factory {


    @Override
    Product getProduct() {
        return new ConcreteProduct();
    }
}
