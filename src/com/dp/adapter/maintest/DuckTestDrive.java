package com.dp.adapter.maintest;

import com.dp.adapter.adapterImp.MallardDuck;
import com.dp.adapter.adapterImp.WildTurkey;
import com.dp.adapter.adapterInst.TurkeyAdapter;
import com.dp.adapter.interfaceAdapter.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
    
    static void testDuck(Duck duck){
    	duck.quack();
    	duck.fly();
    }
}
