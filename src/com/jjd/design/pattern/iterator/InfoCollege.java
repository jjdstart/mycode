package com.jjd.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jjd
 * @date 2020-06-01
 */
public class InfoCollege implements College{

    private List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>(5);
        addDepartment("java info", "java info desc");
        addDepartment("php info", "php info desc");
        addDepartment("c info", "c info desc");
    }

    @Override
    public String getName() {
        return "信息大学";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator<Object> createIterator() {
        InfoColleageIterator infoColleageIterator = new InfoColleageIterator(departmentList);
        return infoColleageIterator;
    }
}
