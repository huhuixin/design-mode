package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class DBConnectionFactory {
    public DBConnection getConnection(String name){
        if("mysql".equalsIgnoreCase(name)){
            return new MysqlConnection();
        }else if("oracle".equalsIgnoreCase(name)){
            return new OracleConnection();
        }else {
            throw new IllegalArgumentException("no such connection");
        }
    }
}
