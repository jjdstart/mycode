package com.jjd.design.pattern.memento;

/**
 * 守护者对象, 保存游戏角色的状态
 * @author jjd
 * @date 2020-06-02
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
