package com.oldmee.easy.duck.behaviorImpl.quack;

import com.oldmee.easy.duck.behavior.quack.QuackBehavior;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:56 2018/12/29
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
