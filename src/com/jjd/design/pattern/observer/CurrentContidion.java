package com.jjd.design.pattern.observer;

/**
 * @author jjd
 * @date 2020-06-02
 */
public class CurrentContidion implements Observer{

    private float temperature;
    private float humidity;
    private float pressure;



    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("***现在网站 气温 : " + temperature + "***");
        System.out.println("***现在网站 气压: " + pressure + "***");
        System.out.println("***现在网站 湿度: " + humidity + "***");
    }
}
