package com.jjd.design.pattern.iterator;

import java.util.Iterator;

/**
 * 这个应该是学院
 * @author jjd
 * @date 2020-06-01
 */
public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator<Object> createIterator();
}
