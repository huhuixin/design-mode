package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Square1 extends Rectangle1 {

    private long sideLength;

    public Square1(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public void setLength(long length) {
       this.sideLength = length;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public void setWidth(long width) {
        this.sideLength = width;
    }
}
