package com.dp.strategy.behaviorImp;

import com.dp.strategy.behaviorInterface.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		
		System.out.println("squeak...");
	}

}
