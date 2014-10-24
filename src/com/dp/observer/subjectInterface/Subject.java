package com.dp.observer.subjectInterface;

import com.dp.observer.observerInterface.Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
