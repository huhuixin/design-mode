package com.hhx.design.pattern.command;

/**
 * 要求执行命令
 *
 * @author hhx
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        this.command.execute();
    }

}
