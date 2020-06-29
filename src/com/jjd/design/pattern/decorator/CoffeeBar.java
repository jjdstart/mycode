package com.jjd.design.pattern.decorator;

/**
 * @author jjd
 * @date 2020-05-30
 */
public class CoffeeBar {
    public static void main(String[] args) {

        Drink order = new Espresso();
        System.out.println("费用 =" + order.cost());
        System.out.println("描述 =" + order.getDes());

        order = new Chocolate(order);
        System.out.println("加巧克力后的费用 =" + order.cost());
        System.out.println("加巧克力后的描述 =" + order.getDes());

        order = new Mike(order);
        System.out.println("加巧克力 + 牛奶后的费用 =" + order.cost());
        System.out.println("加巧克力 + 牛奶后的描述 =" + order.getDes());
    }
}
