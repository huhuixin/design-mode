package com.hhx.design.bridge;

/**
 * 形状
 *
 * @author hhx
 */
public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void show(){
        System.out.println("一个"+ color.getColor() + "的" + getShape());
    }

    public abstract String getShape();
}
