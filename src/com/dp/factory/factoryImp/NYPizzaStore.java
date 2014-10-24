package com.dp.factory.factoryImp;

import com.dp.factory.factoryInterface.PizzaStore;
import com.dp.factory.productImp.NYStyleCheesePizza;
import com.dp.factory.productInterface.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {
		if(item.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}
		else return null;
	}

}
