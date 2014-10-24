package com.dp.facade.maintest;

import com.dp.facade.homeTheater.HomeTheaterFacade;
import com.dp.facade.subSystem.Amplifier;
import com.dp.facade.subSystem.PopcornPopper;
import com.dp.facade.subSystem.Projector;
import com.dp.facade.subSystem.Tuner;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(new Amplifier(),new Tuner(),new Projector(),new PopcornPopper());
		homeTheater.watchMovie("Raiders of the lost ark");
		homeTheater.endMovie();
	}
}
