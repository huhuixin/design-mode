package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class OracleConnection implements DBConnection{
    @Override
    public String getConnection() {
        return "Oracle Connection";
    }
}
