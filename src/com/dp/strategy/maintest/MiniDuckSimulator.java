package com.dp.strategy.maintest;

import java.math.BigDecimal;

import com.dp.strategy.behaviorImp.FlyRocketPowered;
import com.dp.strategy.duckAbstract.Duck;
import com.dp.strategy.duckImp.MallardDuck;
import com.dp.strategy.duckImp.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	
	}
}
