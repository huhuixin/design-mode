package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class ProductDao2 {
    private DBConnection2 dbConnection2;

    public void setDbConnection2(DBConnection2 dbConnection2) {
        this.dbConnection2 = dbConnection2;
    }

    public void addProduct(){
        String conn = dbConnection2.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
