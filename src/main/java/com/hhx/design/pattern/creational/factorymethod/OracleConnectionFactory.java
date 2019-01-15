package com.hhx.design.pattern.creational.factorymethod;

/**
 * @author hhx
 */
public class OracleConnectionFactory implements DBConnectionFactory{
    @Override
    public DBConnection getConnection() {
        return new OracleConnection();
    }
}
