package com.jjd.design.pattern.decorator;

/**
 * 具体的 Decorator， 这里就是调味品
 *
 * @author jjd
 * @date 2020-05-30
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
