package com.jjd.design.pattern.flyweight;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
