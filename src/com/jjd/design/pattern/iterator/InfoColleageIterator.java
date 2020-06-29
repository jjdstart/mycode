package com.jjd.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class InfoColleageIterator implements Iterator {

    private List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (departmentList.size() - 1 <= index) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
