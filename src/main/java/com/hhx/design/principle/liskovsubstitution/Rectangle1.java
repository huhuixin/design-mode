package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Rectangle1{

    private long length;
    private long width;

    public Rectangle1() {
    }

    public Rectangle1(long length, long width) {
        if(width > length){
            throw new IllegalArgumentException("宽度不能大于长度!");
        }
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
