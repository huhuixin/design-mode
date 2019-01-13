package com.hhx.design.pattern.chain.leave;

/**
 * 测试
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        Manager root = new BossManager("sy");
        Manager hhx = new GroupManager("hhx", root);
        Employee xm = new Employee("xiaoming", hhx);
        // 小明请假三天
        xm.request(new LeaveRequest(3));
    }
}
