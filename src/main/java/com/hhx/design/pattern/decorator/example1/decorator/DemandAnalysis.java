package com.hhx.design.pattern.decorator.example1.decorator;

import com.hhx.design.pattern.decorator.example1.Employee;
import com.hhx.design.pattern.decorator.example1.EmployeeDecorator;

/**
 * 需求分析
 *
 * @author hhx
 */
public class DemandAnalysis extends EmployeeDecorator {

    public DemandAnalysis(Employee employee) {
        super(employee);
    }

    @Override
    public void doSth() {
        demandAnalysis();
        super.doSth();
    }

    public void demandAnalysis(){
        System.out.println("需求分析");
    }
}
