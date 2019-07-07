package com.xzh.designpattern.strategy.hero;

/**
 * @Author: siu
 * @Date: 2019/7/7 20:58
 */
public interface IHero {

    String doHeroStuff();

    void changeSuperPower(ISuperPower superPower);
}
