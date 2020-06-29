package com.jjd.design.pattern.state;

/**
 * @author jjd
 * @date 2020-06-04
 */
public class Activity {

    private State state;
    private int count;

    private NoRaffleState noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney() {
        state.deduceMoney();
    }


    public void raffle() {
        //如果当前的状态是抽奖成功}
        if ( state.raffle()){
            //领取奖品
            state.dispensePrize();
        }
    }

    public Activity(int count) {
        this.count = count;
        state = noRaffleState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int currentCount = count;
        count--;
        return currentCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }
}
