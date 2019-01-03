package com.oldmee.easy.duck;

import com.oldmee.easy.duck.behaviorImpl.fly.FlyNoWay;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:19 2019/1/3
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
