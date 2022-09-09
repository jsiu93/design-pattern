package com.xzh.designpattern.fp.template;

public class TemplateMethod {


}

interface Vehicle{

}

abstract class AbstractVehicle implements Vehicle{

    public void start() {
        preStartCheck();
        System.out.println(String.format("%s is starting...", this.getClass().getSimpleName()));
    }

    protected abstract void preStartCheck();

}