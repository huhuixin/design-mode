package com.hhx.design.chain.leave;

/**
 * 小组长
 *
 * @author hhx
 */
public class GroupManager extends Manager{

    public GroupManager(String name, Manager superior) {
        super(name, superior);
    }

    /**
     * 小组长
     * @param request
     */
    @Override
    public void request(LeaveRequest request) {
       if(request.getDays() <= 1){
           System.out.println(name + "同意请求");
       }else if(superior != null){
           // 超出权限,交给上级处理
           System.out.println("超出权限, 交给" + superior.name + "处理");
           superior.request(request);
       }else {
           throw new RuntimeException("未设置上级!");
       }
    }
}
