package com.dp.observer.observerImp;

import com.dp.observer.observerInterface.DisplayElement;
import com.dp.observer.observerInterface.Observer;
import com.dp.observer.subjectInterface.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
