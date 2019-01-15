package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class Test2 {
    public static void main(String[] args) {
        DBConnection connection = DBConnectionFactory2.getConnection(MysqlConnection.class);
        System.out.println(connection.getConnection());
        // TODO sth
    }
}
