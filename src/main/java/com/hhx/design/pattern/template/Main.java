package com.hhx.design.pattern.template;

/**
 * test
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        // 子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
        // 把不变的行为放到超类,抽离出变化的部分放到子类中实现
        TestPaper testPaper = new TestPaper("1 + 1 = ? \n A : 2 , B : 3" , "1 + 2 = ? \n A : 2 , B : 3");
        Answer xiaoming = new Answer(testPaper, "小明") {
            @Override
            public String getA1() {
                return "A";
            }

            @Override
            public String getA2() {
                return "B";
            }
        };
        xiaoming.a1();
        xiaoming.a2();

        Answer xiaoqiang = new Answer(testPaper, "小强") {
            @Override
            public String getA1() {
                return "B";
            }
            @Override
            public String getA2() {
                return "B";
            }
        };

        xiaoqiang.a1();
        xiaoqiang.a2();
    }

}
