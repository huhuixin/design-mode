package com.hhx.design.pattern.creational.factorymethod.car;

/**
 * @author hhx
 */
public class BenzSuvFactory implements SuvFactory {
    @Override
    public SuvCar getSuvCar() {
        return new BenzSuvCar();
    }
}
