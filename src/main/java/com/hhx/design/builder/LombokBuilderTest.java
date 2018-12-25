package com.hhx.design.builder;

import com.hhx.test.Person;

/**
 * lombok中的建造者模式
 * 使用@lombok的 @Builder注解可以自动实现builder模式
 * @see com.hhx.test.Person
 * @author hhx
 */
public class LombokBuilderTest {

    public static void main(String[] args) {
        // Person person = new Person();
        Person person = Person.builder().age(18).name("hhx").build();
        System.out.println(person);
    }
}
