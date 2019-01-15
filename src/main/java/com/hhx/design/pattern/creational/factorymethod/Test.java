package com.hhx.design.pattern.creational.factorymethod;

/**
 * @author hhx
 */
public class Test {
    public static void main(String[] args) {
        //DBConnectionFactory factory = new MysqlConnectionFactory();
        DBConnectionFactory factory = new OracleConnectionFactory();
        DBConnection connection = factory.getConnection();
        System.out.println(connection.getConnection());
        // TODO sth
    }
}
