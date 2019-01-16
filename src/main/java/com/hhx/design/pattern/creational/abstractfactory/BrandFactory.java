package com.hhx.design.pattern.creational.abstractfactory;

/**
 * @author hhx
 */
public interface BrandFactory {
    SaloonCar getSaloonCar();
    SuvCar getSuvCar();
}
