package com.xzh.designpattern.abstractfactory;

import com.xzh.designpattern.factorymethod.Product;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 11:16
 * @since
 */
public abstract class AbstractFactory {

    abstract ProductA getProductA();

    abstract ProductB getProductB();


}
