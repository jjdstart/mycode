package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public abstract class State {

    abstract void deduceMoney();

    abstract boolean raffle();

    abstract void dispensePrize();
}
