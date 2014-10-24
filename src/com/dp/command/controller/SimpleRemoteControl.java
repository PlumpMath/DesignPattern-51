package com.dp.command.controller;

import com.dp.command.commandInterface.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl()
	{
		
	}
	
	public void setCommand(Command command)
	{
		slot = command;
	}
	
	public void buttonWasPressed()
	{
		slot.execute();
	}
}
