package com.xzh.designpattern.strategy;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 10:43
 * @since
 */
public class Client {
    private AbstractBehavior behavior;


    public Client(AbstractBehavior behavior) {
        this.behavior = behavior;
    }

    public void execute() {
        this.behavior.run();
    }
}
