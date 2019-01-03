package com.oldmee.easy.duck;

import com.oldmee.easy.duck.behavior.fly.FlyBehavior;
import com.oldmee.easy.duck.behavior.quack.QuackBehavior;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 17:58 2018/12/29
 */
public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
