package com.hhx.design.principle.compositionaggregation;

/**
 * @author hhx
 */
public class Test1 {
    public static void main(String[] args) {
        ProductDao1 productDao = new ProductDao1();
        DBConnection1 dbConnection = new DBConnection1();
        productDao.addProduct(dbConnection);
    }
}
