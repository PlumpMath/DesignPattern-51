package com.dp.strategy.behaviorImp;

import com.dp.strategy.behaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying...");
	}

}
