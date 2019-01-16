package com.hhx.design.pattern.creational.abstractfactory;

/**
 * @author hhx
 */
public class VwFactory implements BrandFactory{
    @Override
    public SaloonCar getSaloonCar() {
        return new VwSaloonCar();
    }
    @Override
    public SuvCar getSuvCar() {
        return new VwSuvCar();
    }
}
