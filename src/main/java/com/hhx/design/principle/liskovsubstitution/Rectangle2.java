package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Rectangle2 implements Quadrangle {
    private long length;
    private long width;

    public Rectangle2(long length, long width) {
        if(width > length){
            throw new IllegalArgumentException("宽度不能大于长度!");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
