package com.dp.command.maintest;

import com.dp.command.commandImp.LightOnCommand;
import com.dp.command.controller.SimpleRemoteControl;
import com.dp.command.instance.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
