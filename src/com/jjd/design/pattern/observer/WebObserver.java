package com.jjd.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jjd
 * @date 2020-06-02
 */
public class WebObserver implements Subject{

    private List<Observer> observerList;

    public WebObserver() {
        this.observerList = new ArrayList<>(10);
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);

    }

    @Override
    public void remove(Observer o) {
        if (observerList.contains(o)) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObserver(float temperature, float humidity, float pressure) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(temperature, humidity, pressure);
        }
    }
}
