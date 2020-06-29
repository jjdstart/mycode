package com.jjd.design.pattern.observer;

/**
 * @author jjd
 * @date 2020-06-02
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
