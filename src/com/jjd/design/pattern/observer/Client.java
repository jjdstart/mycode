package com.jjd.design.pattern.observer;

/**
 * @author jjd
 * @date 2020-06-02
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new WebObserver();

        Observer currentContidion = new CurrentContidion();
        Observer baidu = new Baidu();
        subject.registerObserver(currentContidion);
        subject.registerObserver(baidu);

        subject.notifyObserver(25f, 80f, 120);
    }
}
