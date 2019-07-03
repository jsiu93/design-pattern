package com.xzh.designpattern.abstractfactory;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 16:51
 * @since
 */
public class ConcreteProductB extends ProductB {

    @Override
    public String getName() {
        System.out.println("ConcreteProductB.getName");
        return "c productB";
    }

}
