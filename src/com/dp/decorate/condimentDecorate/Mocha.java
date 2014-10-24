package com.dp.decorate.condimentDecorate;

import com.dp.decorate.beverage.Beverage;

public class Mocha extends CondimentDecorate{

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + 
				",Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}
	
}
