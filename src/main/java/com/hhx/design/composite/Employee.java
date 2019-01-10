package com.hhx.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工
 *
 * @author hhx
 */

public class Employee {
    private String name;
    /**
     * 所属等级
     */
    private Integer dept = 0;
    private int salary;
    /**
     * 属下列表
     */
    private List<Employee> subordinates;

    public Employee(String name, int sal) {
        this.name = name;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    /**
     * 添加下属
     * @param e
     */
    public void add(Employee e) {
        e.dept = this.dept + 1;
        subordinates.add(e);
    }

    /**
     * 移除下属
     * @param e
     */
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i = 0; i < dept; i++) {
            stringBuilder.append("- ");
        }
        stringBuilder.append(name).append("\n");
        subordinates.forEach(e -> stringBuilder.append(e.toString()));
        return stringBuilder.toString();
    }
}
