package com.hhx.design.principle.compositionaggregation;

/**
 *
 */
public class Test2 {
    public static void main(String[] args) {
        ProductDao2 productDao2 = new ProductDao2();
        //productDao2.setDbConnection2(new MySQLConnection());
        //productDao2.addProduct();
        productDao2.setDbConnection2(new PostgreSQLConnection());
        productDao2.addProduct();
    }
}
