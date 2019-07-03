package com.xzh.designpattern.strategy;

/**
 * @author jsiu
 * @description
 * @date 2019-07-01 10:44
 * @since
 */
public class Main {


    public static void main(String[] args) {
        AbstractBehavior behavior = new ConcreteBehaviorB();
        Client client = new Client(behavior);
        client.execute();
    }


}
