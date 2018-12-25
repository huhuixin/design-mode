package com.hhx.design.state;

/**
 * 手机状态枚举
 *
 * @author hhx
 */
public enum MobileStateEnums implements State{

    /**
     * 正常状态
     */
    NORMAL(){
        @Override
        public void handle(Mobile mobile) {
            System.out.println("正常状态");
        }
    },
    DOWN(){
        @Override
        public void handle(Mobile mobile) {
            throw new RuntimeException("手机已欠费");
        }
    }
    ;


}
