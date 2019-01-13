package com.hhx.design.principle.liskovsubstitution;

/**
 * @author hhx
 */
public class Test2 {
    /**
     * 调整长度为宽度的2倍
     * @param rectangle
     */
    public static void resize(Rectangle2 rectangle){
        rectangle.setLength(rectangle.getWidth() * 2);
        System.out.println("resize方法结束 width:"+ rectangle.getWidth() + " length:"+ rectangle.getLength());
    }
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2(10, 8);
        resize(rectangle);
        Square2 square = new Square2(10);
        // 编译报错
        // resize(square);
    }
}
