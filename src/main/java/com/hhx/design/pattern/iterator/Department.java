package com.hhx.design.pattern.iterator;

import java.util.List;

/**
 * 部门,提供员工的迭代器
 *
 * @author hhx
 */
public class Department implements Iterable<String> {

    private List<String> employees;

    public Department(List<String> employees) {
        this.employees = employees;
    }

    /**
     * 获取迭代器
     * @return
     */
    @Override
    public Iterator<String> getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<String>{

        private int nextIndex;

        private EmployeeIterator() {
            nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return nextIndex <= employees.size() - 1;
        }

        @Override
        public String next() {
            return employees.get(nextIndex++);
        }
    }
}
