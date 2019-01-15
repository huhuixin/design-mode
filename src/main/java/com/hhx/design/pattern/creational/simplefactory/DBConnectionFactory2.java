package com.hhx.design.pattern.creational.simplefactory;

/**
 * @author hhx
 */
public class DBConnectionFactory2 {
    public static <T extends DBConnection> DBConnection getConnection(Class<T> clazz){
        try {
            return (DBConnection) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
