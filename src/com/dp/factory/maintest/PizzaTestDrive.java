package com.dp.factory.maintest;

import com.dp.factory.factoryImp.NYPizzaStore;
import com.dp.factory.factoryInterface.PizzaStore;
import com.dp.factory.productInterface.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		
	}
}
