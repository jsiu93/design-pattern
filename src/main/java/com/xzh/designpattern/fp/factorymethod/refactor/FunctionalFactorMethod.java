package com.xzh.designpattern.fp.factorymethod.refactor;

import java.util.function.Function;

public class FunctionalFactorMethod {

    public static void main(String[] args) {
        Vehicle apply = VehicleType.TRUCK.factory.apply(VehicleColor.RED);
    }

}


enum VehicleType {
    CAR(Car::new), TRUCK(Truck::new), BUS(Bus::new);

    public final Function<VehicleColor, Vehicle> factory;

    VehicleType(Function<VehicleColor, Vehicle> factory) {
        this.factory = factory;
    }
}

enum VehicleColor {
    RED, BLUE, GREEN
}

class Vehicle {

    private VehicleColor color;

    public Vehicle(VehicleColor color) {
        this.color = color;
    }


}

class Car extends Vehicle {


    public Car(VehicleColor color) {
        super(color);
    }
}

class Truck extends Vehicle {


    public Truck(VehicleColor color) {
        super(color);
    }
}

class Bus extends Vehicle {


    public Bus(VehicleColor color) {
        super(color);
    }
}