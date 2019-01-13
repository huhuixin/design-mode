package com.hhx.design.pattern.decorator.example1;

import com.hhx.design.pattern.decorator.example1.decorator.DemandAnalysis;
import com.hhx.design.pattern.decorator.example1.decorator.FunctionTest;

/**
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Programmer();
        // 将软件测试加入到职责链中
        employee = new FunctionTest(employee);
        // 将需求分析加入到职责链中
        employee = new DemandAnalysis(employee);
        employee.doSth();
    }

}
