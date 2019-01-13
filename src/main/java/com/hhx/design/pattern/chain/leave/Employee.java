package com.hhx.design.pattern.chain.leave;

/**
 * 员工
 *
 * @author hhx
 */
public class Employee extends Manager{

    public Employee(String name, Manager superior) {
        super(name, superior);
    }

    /**
     * 直接发送请求给上级
     * @param request
     */
    @Override
    public void request(LeaveRequest request) {
        System.out.println(name + "请假" + request.getDays() + "天!");
        System.out.println("交给" + superior.name + "处理!");
        superior.request(request);
    }
}
