package com.oldmee.easy.duck.behaviorImpl.fly;

import com.oldmee.easy.duck.behavior.fly.FlyBehavior;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:07 2018/12/29
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
