package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:26
 * @since
 */
public abstract class Beverage {


    String description = "UNKNOWN";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}




