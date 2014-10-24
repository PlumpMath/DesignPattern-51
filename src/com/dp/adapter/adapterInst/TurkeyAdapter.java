package com.dp.adapter.adapterInst;

import com.dp.adapter.interfaceAdapter.Duck;
import com.dp.adapter.interfaceAdapter.Turkey;

public class TurkeyAdapter implements Duck{
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();		
	}

	@Override
	public void fly() {
       for(int i = 0 ; i < 5; i++){
    	   turkey.fly();
       }
	}
	
}
