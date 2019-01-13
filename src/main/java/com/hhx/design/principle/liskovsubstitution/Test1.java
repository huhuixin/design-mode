package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Test1 {
    /**
     * 调整长度为宽度的2倍
     * @param rectangle
     */
    public static void resize(Rectangle1 rectangle){
        rectangle.setLength(rectangle.getWidth() * 2);
        System.out.println("resize方法结束 width:"+ rectangle.getWidth() + " length:"+ rectangle.getLength());
    }
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(10, 8);
        resize(rectangle);
        Rectangle1 square1 = new Square1(10);
        resize(square1);
    }
}
