package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class MySQLConnection extends DBConnection2 {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
