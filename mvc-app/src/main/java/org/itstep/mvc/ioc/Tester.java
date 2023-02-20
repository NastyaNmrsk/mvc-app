package org.itstep.mvc.ioc;

public class Tester {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        VEngine ve1 = new VEngine();
        ve1.setType("V-type");
        ve1.setV(4.4);
        ElectroEngine ee = new ElectroEngine();
        ee.setType("V-type");
        ee.setV(3.6);

        c1.setEngine(ve1);
        c1.setEngine(ee);
    }
}
