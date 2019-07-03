package com.xzh.designpattern.abstractfactory;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 17:07
 * @since
 */
public class ConcreteFactoryB extends AbstractFactory {

    @Override
    ProductA getProductA() {
        System.out.println("ConcreteFactoryB.getProductA");
        return new ConcreteProductA();
    }

    @Override
    ProductB getProductB() {
        System.out.println("ConcreteFactoryB.getProductB");
        return new ConcreteProductB();
    }

}
