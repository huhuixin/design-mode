package com.hhx.design.pattern.state;

/**
 * 手机的状态
 *
 * @author hhx
 */
public interface State {

    void handle(Mobile mobile);
}
