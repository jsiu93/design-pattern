package com.xzh.designpattern.strategy.hero;

/**
 * @Author: siu
 * @Date: 2019/7/7 21:04
 */
public abstract class AbstractHero implements IHero {

    private ISuperPower superPower;

    public AbstractHero(ISuperPower superPower) {
        this.superPower = superPower;
    }

    public AbstractHero() {
        this(new RegularJoe());
    }

    @Override
    public String doHeroStuff() {
        return superPower.exercisePower();
    }

    @Override
    public void changeSuperPower(ISuperPower superPower) {
        this.superPower = superPower;
    }
}
