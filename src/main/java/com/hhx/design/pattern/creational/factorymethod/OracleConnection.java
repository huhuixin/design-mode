package com.hhx.design.pattern.creational.factorymethod;

/**
 * @author hhx
 */
public class OracleConnection implements DBConnection{
    @Override
    public String getConnection() {
        return "Oracle Connection";
    }
}
