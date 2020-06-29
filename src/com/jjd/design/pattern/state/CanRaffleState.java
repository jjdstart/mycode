package com.jjd.design.pattern.state;

import java.util.Random;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class CanRaffleState extends State {

    private Activity activity;

    @Override
    void deduceMoney() {
        System.out.println("请先抽奖呢亲");
    }

    @Override
    boolean raffle() {
        System.out.println("开始抽奖");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0) {
            System.out.println("恭喜中将了,开始发放奖品");
            activity.setState(activity.dispenseState);
            return true;
        } else {
            System.out.println("恨遗憾，未中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    void dispensePrize() {
        System.out.println("还没抽奖呢，没有奖品");
    }

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }
}
