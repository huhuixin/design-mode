package com.hhx.design.pattern.creational.factorymethod;

/**
 * @author hhx
 */
public class MysqlConnection implements DBConnection{
    @Override
    public String getConnection() {
        return "Mysql Connection";
    }
}
