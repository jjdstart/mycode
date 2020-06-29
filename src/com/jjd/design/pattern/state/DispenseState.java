package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class DispenseState extends State {

    private Activity activity;

    @Override
    void deduceMoney() {
        System.out.println("中奖了，不用换积分了哈");
    }

    @Override
    boolean raffle() {
        System.out.println("中奖了，不用抽了");
        return false;
    }

    @Override
    void dispensePrize() {
        if (activity.getCount() != 0) {
            System.out.println("发过过去了呢");
        } else {
            System.out.println("抱歉，发完了");
            activity.setState(activity.getDispensOutState());
        }
    }

    public DispenseState(Activity activity) {
        super();
        this.activity = activity;
    }
}
