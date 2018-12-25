package com.hhx.design.chain.leave;

import lombok.Data;

/**
 * 请假的请求
 *
 * @author hhx
 */
@Data
public class LeaveRequest {
    /**
     * 请假天数
     */
    private int days;

    public LeaveRequest(int days) {
        this.days = days;
    }
}
