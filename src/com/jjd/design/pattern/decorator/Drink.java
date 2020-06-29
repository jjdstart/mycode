package com.jjd.design.pattern.decorator;

/**
 * Component 主体
 * @author jjd
 * @date 2020-05-30
 */
public abstract class Drink {
    //描述
    public String des;

    private float price;

    //计算价格
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
