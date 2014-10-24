package com.dp.facade.homeTheater;

import com.dp.facade.subSystem.Amplifier;
import com.dp.facade.subSystem.PopcornPopper;
import com.dp.facade.subSystem.Projector;
import com.dp.facade.subSystem.Tuner;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	Projector projector;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp,Tuner tuner,Projector projector,PopcornPopper popper)
	{
		this.amp = amp;
		this.tuner = tuner;
		this.projector = projector;
		this.popper = popper;
	}
	
	public void watchMovie(String movie)
	{
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		
	}
	
	public void endMovie()
	{
		System.out.println("Shutting movie theater down...");
		popper.off();
		projector.off();
		amp.off();
	}
}
