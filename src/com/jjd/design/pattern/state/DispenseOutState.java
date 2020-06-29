package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class DispenseOutState extends State {



    @Override
    void deduceMoney() {
        System.out.println("不可以");
    }

    @Override
    boolean raffle() {
        System.out.println("不可以");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("不可以");
    }

    public DispenseOutState(Activity activity) {
        super();
    }
}
