package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class ProductDao1 {
    public void addProduct(DBConnection1 dbConnection){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
