package com.dp.adapter.adapterImp;

import com.dp.adapter.interfaceAdapter.Duck;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("i'm flying");		
	}
	
	
	
	
}
