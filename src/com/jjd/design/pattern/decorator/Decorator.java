package com.jjd.design.pattern.decorator;

/**
 * 装饰者
 *
 * @author jjd
 * @date 2020-05-30
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) { //组合
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
