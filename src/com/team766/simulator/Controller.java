package com.team766.simulator;

import java.util.Scanner;

public class Controller implements Runnable{
	
	Scanner keyboard = new Scanner(System.in);
	
	private static boolean enabled;
	
	private enum RobotState {
		OperatorControl, Autonomous, Test
	}
	private static RobotState state;
	
	public Controller(){
		state = RobotState.OperatorControl;
		enabled = false;
	}
	
	public void run(){
		while(true){
			System.out.println("click e to enable");
			String on = keyboard.nextLine();
			if(on.equals("e"))
				enabled = true;
			System.out.println("Which state would you like to simulate?\na.\tOperator Control\nb.\tAutonomous\nc.\tTest");
			String in = keyboard.nextLine();
			if(in.equalsIgnoreCase("a"))
				state = RobotState.OperatorControl;
			else if(in.equalsIgnoreCase("b"))
				state = RobotState.Autonomous;
			else
				state = RobotState.Test;

		}
	}
	public static boolean getDisabled(){
		return enabled;
	}
	public static boolean getEnabled(){
		return enabled;
	}
	public static boolean getOperatorControl(){
		return state == RobotState.OperatorControl;
	}
	public static boolean getAutonomous(){
		return state == RobotState.Autonomous;
	}
	public static boolean getTest(){
		return state == RobotState.Test;
	}
	public static boolean getEStop(){
		return false;
	}
	
}
