package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class NoRaffleState extends State {

    private Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    void deduceMoney() {
        activity.setState(activity.getCanRaffleState());
        System.out.println("开始扣除积分，开始抽奖");
    }

    @Override
    boolean raffle() {
        System.out.println("请先兑换抽奖次数");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("还未抽奖，请先抽奖");
    }
}
