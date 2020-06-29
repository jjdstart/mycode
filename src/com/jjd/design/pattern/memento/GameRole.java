package com.jjd.design.pattern.memento;

/**
 * @author jjd
 * @date 2020-06-02
 */
public class GameRole {

    private int vit;
    private int def;

    //创建Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //从备忘录对象，恢复 GameRole 的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + "  防御力: " + this.def);
    }
}
