package com.hhx.design.pattern.chain;

/**
 * 处理者
 *
 * @author hhx
 */
public abstract class Handle {

    private Handle next;

    public Handle(Handle next) {
        this.next = next;
    }

    public boolean handleSuccess(){
        if(handleRequest()){
            return next.handleSuccess();
        }
        return false;
    }

    abstract boolean handleRequest();
}
