package com.hhx.design.facede;

import com.hhx.design.facede.system.CPU;
import com.hhx.design.facede.system.Disk;
import com.hhx.design.facede.system.Memory;

/**
 * 计算机
 *
 * @author hhx
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(CPU cpu, Disk disk, Memory memory) {
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }

    public void start(){
        // 计算机启动
        System.out.println(" 计算机开始启动 ....");
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutdown(){
        // 计算机关闭
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println(" 计算机关闭完成 ....");
    }
}
