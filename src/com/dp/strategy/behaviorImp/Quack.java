package com.dp.strategy.behaviorImp;

import com.dp.strategy.behaviorInterface.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		
		System.out.println("quack...");
	}

}
