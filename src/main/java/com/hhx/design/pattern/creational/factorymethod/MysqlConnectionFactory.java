package com.hhx.design.pattern.creational.factorymethod;

/**
 * @author hhx
 */
public class MysqlConnectionFactory implements DBConnectionFactory{
    @Override
    public DBConnection getConnection() {
        return new MysqlConnection();
    }
}
