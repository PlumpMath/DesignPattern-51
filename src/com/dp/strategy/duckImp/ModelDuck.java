package com.dp.strategy.duckImp;

import com.dp.strategy.behaviorImp.FlyNoWay;
import com.dp.strategy.behaviorImp.Quack;
import com.dp.strategy.duckAbstract.Duck;

public class ModelDuck extends Duck{

	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model Duck");
	}
	

}
