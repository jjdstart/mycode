package com.jjd.design.pattern.iterator;

import java.util.Iterator;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class ComputerCollegeIterator implements Iterator<Object> {

    //这里我们需要 Department  是以怎样的方式存放=>数组
    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (departments.length <= position || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[position++];
    }
}
