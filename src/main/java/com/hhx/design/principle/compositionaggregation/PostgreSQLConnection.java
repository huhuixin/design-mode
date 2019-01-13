package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class PostgreSQLConnection extends DBConnection2 {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
