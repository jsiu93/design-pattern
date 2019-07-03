package com.xzh.designpattern.abstractfactory;

import com.xzh.designpattern.factorymethod.Product;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 16:50
 * @since
 */
public class ConcreteFactoryA extends  AbstractFactory
{

    @Override
    ProductA getProductA() {
        System.out.println("ConcreteFactoryA.getProductA");
        return new ConcreteProductA();
    }

    @Override
    ProductB getProductB() {
        System.out.println("ConcreteFactoryA.getProductB");
        return new ConcreteProductB();
    }
}
