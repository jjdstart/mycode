package com.jjd.design.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人（Man , Woman）
 * @author jjd
 * @date 2020-06-01
 */
public class ObjectStructure {

    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        personList.forEach(person -> person.accept(action));
    }
}
