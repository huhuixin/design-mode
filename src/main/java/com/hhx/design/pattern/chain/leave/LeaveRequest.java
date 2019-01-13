package com.hhx.design.pattern.chain.leave;

/**
 * 请假的请求
 *
 * @author hhx
 */

public class LeaveRequest {
    /**
     * 请假天数
     */
    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LeaveRequest(int days) {
        this.days = days;
    }
}
