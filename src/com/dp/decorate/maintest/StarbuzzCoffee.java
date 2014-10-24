package com.dp.decorate.maintest;

import com.dp.decorate.beverage.Beverage;
import com.dp.decorate.beverage.Espresso;
import com.dp.decorate.beverage.HouseBlend;
import com.dp.decorate.condimentDecorate.Mocha;

public class StarbuzzCoffee {
	
	public static void main(String[] args){
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $"+beverage2.cost());
		
	}
	
}
