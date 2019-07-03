package com.xzh.designpattern.factorymethod;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 10:28
 * @since
 */
public class Main {
    public static void main(String[] args) {

        Factory factory = new ConcreteFactory();
        Product product = factory.getProduct();
        System.err.println(product.getName());
    }


}
