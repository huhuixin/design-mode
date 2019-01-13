package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class DBConnection1 {
    public String getConnection(){
        return "MySQL数据库连接";
    }
    public String getPostgreSQLConnection(){
        return "PostgreSQL数据库连接";
    }
}
