package com.hhx.design.pattern.composite;

/**
 * 演示了一个组织中员工的层次结构
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", 30000);
        // 市场
        Employee headMarketing = new Employee("Michel", 20000);
        CEO.add(headMarketing);
        Employee clerk1 = new Employee("Laura", 10000);
        Employee clerk2 = new Employee("Bob", 10000);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
        // 销售
        Employee headSales = new Employee("Robert", 20000);
        CEO.add(headSales);
        Employee salesExecutive1 = new Employee("Richard", 10000);
        Employee salesExecutive2 = new Employee("Rob", 10000);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        System.out.println(CEO);
    }
}
