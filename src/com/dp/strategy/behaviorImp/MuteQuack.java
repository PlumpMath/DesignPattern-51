package com.dp.strategy.behaviorImp;

import com.dp.strategy.behaviorInterface.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		
		System.out.println("silence...");
	}

}
