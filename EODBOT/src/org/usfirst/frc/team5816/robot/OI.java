package org.usfirst.frc.team5816.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	
	static Joystick leftJoystick, rightJoystick, XboxController;
	static boolean lowSpeedButton, mediumSpeedButton, highSpeedButton, lowGearButton, highGearButton;
	static int leftJoystickPort = 0;
	static int rightJoystickPort = 1;
	static int XboxControllerPort = 2;
	
	public void joystickInit() {
		
		leftJoystick = new Joystick(leftJoystickPort);
		rightJoystick = new Joystick(rightJoystickPort);
		XboxController = new Joystick(XboxControllerPort);
		
	}
	
	public void joystickButtons() {
		
		lowSpeedButton = leftJoystick.getRawButton(1);
		mediumSpeedButton = leftJoystick.getRawButton(2);
		highSpeedButton = leftJoystick.getRawButton(3);
		
		lowGearButton = rightJoystick.getRawButton(1);
		highGearButton = rightJoystick.getRawButton(2);
		
	}

}