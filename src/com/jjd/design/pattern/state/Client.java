package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class Client {

    public static void main(String[] args) {
        Activity activity = new Activity(3);

        for (int i = 0; i < 10; i++) {
            activity.debuctMoney();
            activity.raffle();
        }
    }
}
