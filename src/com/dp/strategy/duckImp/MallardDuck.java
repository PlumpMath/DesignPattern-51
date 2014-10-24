package com.dp.strategy.duckImp;

import com.dp.strategy.behaviorImp.FlyWithWings;
import com.dp.strategy.behaviorImp.Quack;
import com.dp.strategy.duckAbstract.Duck;

public class MallardDuck extends Duck{
	
	public MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior= new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck");
		
	}

}
