package com.hhx.design.state;

/**
 * 手机的状态
 *
 * @author hhx
 */
public interface State {

    void handle(Mobile mobile);
}
