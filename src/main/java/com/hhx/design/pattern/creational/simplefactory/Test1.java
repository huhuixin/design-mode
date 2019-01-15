package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class Test1 {
    public static void main(String[] args) {
        DBConnectionFactory factory = new DBConnectionFactory();
        DBConnection connection = factory.getConnection("mysql");
        System.out.println(connection.getConnection());
        // TODO sth
    }
}
