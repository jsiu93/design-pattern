package com.xzh.designpattern.strategy.hero;

/**
 * @Author: siu
 * @Date: 2019/7/7 21:12
 */
public class Main {

    public static void main(String[] args) {
        IHero hero = new SpiderMan();
        System.err.println(hero.doHeroStuff());
        hero.changeSuperPower(new Fight());

        System.err.println(hero.doHeroStuff());
    }
}
