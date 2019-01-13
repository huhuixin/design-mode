package com.hhx.design.pattern.decorator.example1.decorator;

import com.hhx.design.pattern.decorator.example1.Employee;
import com.hhx.design.pattern.decorator.example1.EmployeeDecorator;

/**
 * 需求分析
 *
 * @author hhx
 */
public class FunctionTest extends EmployeeDecorator {

    public FunctionTest(Employee employee) {
        super(employee);
    }

    @Override
    public void doSth() {
        super.doSth();
        functionTest();
    }

    public void functionTest(){
        System.out.println("功能测试");
    }
}
