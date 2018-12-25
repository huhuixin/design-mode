package com.hhx.design.template;

/**
 * 考试试卷
 * @author hhx
 */
public abstract class Answer {

    private TestPaper testPaper;
    private String name;

    public Answer(TestPaper testPaper, String name) {
        this.testPaper = testPaper;
        this.name = name;
    }

    /**
     * 问题1
     */
    public void a1(){
        System.out.println("问题1:");
        testPaper.q1();
        System.out.println(name + "的答案是" + getA1());
    }

    public abstract String getA1();

    /**
     * 问题2
     */
    public void a2(){
        System.out.println("问题2:");
        testPaper.q2();
        System.out.println(name + "的答案是" + getA2());
    }

    public abstract String getA2();
}
