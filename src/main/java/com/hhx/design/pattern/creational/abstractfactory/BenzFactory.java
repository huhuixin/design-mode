package com.hhx.design.pattern.creational.abstractfactory;

/**
 * @author hhx
 */
public class BenzFactory implements BrandFactory{
    @Override
    public SaloonCar getSaloonCar() {
        return new BenzSaloonCar();
    }
    @Override
    public SuvCar getSuvCar() {
        return new BenzSuvCar();
    }
}
