package com.hhx.design.pattern.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * 迭代器
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("第一个", "第二个", "第三个");
        Department department = new Department(names);
        Iterator<String> it = department.getIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
