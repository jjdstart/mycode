package com.jjd.design.pattern.adapter.classadapter;

/**
 * @author jjd
 * @date 2020-05-28
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
