package com.xzh.designpattern.abstractfactory;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 16:51
 * @since
 */
public class ConcreteProductA extends ProductA {


    @Override
    public String getName() {
        System.out.println("ConcreteProductA.getName");
        return "c productA";
    }
}
