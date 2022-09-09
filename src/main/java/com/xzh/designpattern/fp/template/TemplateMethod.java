package com.xzh.designpattern.fp.template;




import java.util.function.Function;

public class TemplateMethod {

    public static void main(String[] args) {
        Vehicle blueBus = VehicleType.BUS.factory.apply(VehicleColor.BLUE);
        blueBus.start(() -> System.out.println("bus preCheck"));
    }


}

interface Vehicle{

    default void start(Runnable preStartChecks) {
        preStartChecks.run();
        System.out.println(String.format("%s is starting...", this.getClass().getSimpleName()));
    }

}

enum VehicleType {
    BUS(Bus::new);

    public final Function<VehicleColor, Vehicle> factory;

    VehicleType(Function<VehicleColor, Vehicle> factory) {
        this.factory = factory;
    }
}

enum VehicleColor {
    RED, BLUE, GREEN
}

class Bus implements Vehicle {

    public Bus(VehicleColor vehicleColor) {

    }
}

