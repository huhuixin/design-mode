package com.hhx.design.pattern.decorator.example1;

/**
 * 员工的装饰器
 *
 * @author hhx
 */
public abstract class EmployeeDecorator implements Employee {

    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void doSth() {
        employee.doSth();
    }
}
