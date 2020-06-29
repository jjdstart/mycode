package com.jjd.design.pattern.observer;

/**
 *
 * @author jjd
 * @date 2020-06-02
 */
public interface Subject {

    void registerObserver(Observer o);

    void remove(Observer o);

    void notifyObserver(float temperature, float humidity, float pressure);

}
