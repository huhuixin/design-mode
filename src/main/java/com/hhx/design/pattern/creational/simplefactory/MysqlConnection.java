package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class MysqlConnection implements DBConnection{
    @Override
    public String getConnection() {
        return "Mysql Connection";
    }
}
