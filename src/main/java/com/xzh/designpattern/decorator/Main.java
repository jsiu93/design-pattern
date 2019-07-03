package com.xzh.designpattern.decorator;

/**
 * @author jsiu
 * @description
 * @date 2019-06-28 16:25
 */
public class Main {

    public static void main(String[] args) {
        Mocha mocha = new Mocha(new HouseBlend());
        System.err.println(mocha.getDescription());
        System.err.println(mocha.cost());

        Whip whip = new Whip(mocha);
        System.err.println(whip.getDescription());
        System.err.println(whip.cost());
    }

}
