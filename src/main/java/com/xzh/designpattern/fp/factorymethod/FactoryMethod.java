package com.xzh.designpattern.fp.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {
        VehicleFactory.instanceOfType(VehicleType.BUS, VehicleColor.BLUE);
    }

}

class VehicleFactory {
    public static Vehicle instanceOfType(VehicleType type, VehicleColor color) {
        if (type.equals(VehicleType.CAR)) {
            return new Car(color);
        } else if (type.equals(VehicleType.TRUCK)) {
            return new Truck(color);
        } else {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

class Vehicle {

    private VehicleColor color;

    public Vehicle(VehicleColor color) {
        this.color = color;
    }


}

enum VehicleType {
    CAR, TRUCK, BUS
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

enum VehicleColor {
    RED, BLUE, GREEN
}