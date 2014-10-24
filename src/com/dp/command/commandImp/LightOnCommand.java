package com.dp.command.commandImp;

import com.dp.command.commandInterface.Command;
import com.dp.command.instance.Light;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
	
	

}
