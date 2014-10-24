package com.dp.strategy.duckAbstract;

import com.dp.strategy.behaviorInterface.FlyBehavior;
import com.dp.strategy.behaviorInterface.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	public Duck(){}
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void performQuack()
	{
		quackBehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}

}
