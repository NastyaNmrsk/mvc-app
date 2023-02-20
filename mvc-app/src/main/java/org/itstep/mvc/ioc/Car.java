package org.itstep.mvc.ioc;

import lombok.Data;

@Data
public class Car {
    private String model;
    private double price;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car() {

    }

    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void go() {
        System.out.println("Using " + engine.getType());
    }
}
