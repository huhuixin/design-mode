package com.hhx.design.pattern.chain.leave;

/**
 * 管理员
 *
 * @author hhx
 */
public abstract class Manager {
    protected String name;
    /**
     * 上级
     */
    protected Manager superior;

    public Manager(String name, Manager superior) {
        this.name = name;
        this.superior = superior;
    }



    /**
     * 请假请求
     * @param request
     */
    public abstract void request(LeaveRequest request);
}
