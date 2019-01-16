package com.hhx.design.pattern.creational.factorymethod.car;

/**
 * @author hhx
 */
public class VwSaloonFactory implements SaloonFactory {
    @Override
    public SaloonCar getSaloonCar() {
        return new VwSaloonCar();
    }
}
