package com.hhx.design.chain.leave;

/**
 * 老板
 *
 * @author hhx
 */
public class BossManager extends Manager{

    public BossManager(String name) {
        super(name, null);
    }

    /**
     * 小组长
     * @param request
     */
    @Override
    public void request(LeaveRequest request) {
       if(request.getDays() <= 30){
           System.out.println(name + "同意请求");
       }else{
           System.out.println(name + "不同意");
       }
    }
}
