package com.xzh.designpattern.abstractfactory;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 16:59
 * @since
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        ProductA productA = factory.getProductA();
        ProductB productB = factory.getProductB();

        System.err.println(productA.getName());

        productA.getDesc();

        System.err.println(productB.getName());

    }
}
