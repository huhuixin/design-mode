package com.hhx.design.pattern.creational.factorymethod.car;

/**
 * @author hhx
 */
public class BenzSaloonFactory implements SaloonFactory {
    @Override
    public  SaloonCar getSaloonCar() {
        return new BenzSaloonCar();
    }
}
