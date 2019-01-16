package com.hhx.design.pattern.creational.factorymethod.car;

/**
 * @author hhx
 */
public class VwSuvFactory implements SuvFactory {
    @Override
    public SuvCar getSuvCar() {
        return new VwSuvCar();
    }
}
