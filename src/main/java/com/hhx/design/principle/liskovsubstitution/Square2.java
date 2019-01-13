package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Square2 implements Quadrangle {

    private long sideLength;

    public Square2(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
