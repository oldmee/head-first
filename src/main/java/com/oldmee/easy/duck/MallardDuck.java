package com.oldmee.easy.duck;

import com.oldmee.easy.duck.behaviorImpl.fly.FlyWithWings;
import com.oldmee.easy.duck.behaviorImpl.quack.MuteQuack;
import com.oldmee.easy.duck.behaviorImpl.quack.Quack;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 17:58 2018/12/29
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
