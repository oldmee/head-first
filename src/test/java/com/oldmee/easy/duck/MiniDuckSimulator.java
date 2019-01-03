package com.oldmee.easy.duck;

import com.oldmee.easy.duck.behaviorImpl.fly.FlyRocketPowered;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:43 2019/1/2
 */
public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck modelduck = new ModelDuck();
        modelduck.performFly();
        modelduck.setQuackBehavior(new FlyRocketPowered());
        modelduck.performFly();
    }
}
