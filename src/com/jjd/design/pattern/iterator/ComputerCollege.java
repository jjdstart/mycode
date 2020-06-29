package com.jjd.design.pattern.iterator;

import java.util.Iterator;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;// 保存当前数组的对象个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java", "java desc");
        addDepartment("c", "c desc");
        addDepartment("php", "php desc");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator<Object> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
