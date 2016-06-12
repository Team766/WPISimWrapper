/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

import com.team766.simulator.Ports;
import com.team766.simulator.VRConnector;

public class PWMJNI extends DIOJNI {
  public static boolean allocatePWMChannel(long digital_port_pointer){
	  System.out.println("PWMJNI: allocatePWMChannel()");
	  return true;
  }

  public static void freePWMChannel(long digital_port_pointer){
	  System.out.println("PWMJNI: freePWMChannel()");
  }

  public static void setPWM(long digital_port_pointer, double value){
//	 System.out.println("PWMJNI: setPWM()");
	  
	  //Cap values between [-1, 1]
//	  value = Math.abs(value) > 1? 1.0 * (Math.abs(value)/value) : value ;
	  
	  if(digital_port_pointer == Ports.PWM_Left_Drive){
		  VRConnector.getInstance().putCommandFloat(VRConnector.LEFT_MOTOR, (float)value);
//		  System.out.println("Left Drive: " + value);
	  }
	  else if(digital_port_pointer == Ports.PWM_Right_Drive){
		  VRConnector.getInstance().putCommandFloat(VRConnector.RIGHT_MOTOR, (float)value);
//		  System.out.println("Right Drive: " + value);
	  }
  }

  public static short getPWM(long digital_port_pointer){
	  System.out.println("PWMJNI: getPWM()");
	  return 1;
  }

  public static void latchPWMZero(long digital_port_pointer){
	  System.out.println("PWMJNI: latchPWMZero()");
  }

  public static void setPWMPeriodScale(long digital_port_pointer, int squelchMask){
	  System.out.println("PWMJNI: setPWMPeriodScale()");
  }

  public static long allocatePWM(){
	  System.out.println("PWMJNI: allocatePWM()");
	  return 1;
  }

  public static void freePWM(long pwmGenerator){
	  System.out.println("PWMJNI: freePWM()");
  }
  
  public static void setPWMRate(double rate){
	  System.out.println("PWMJNI: setPWMRate()");
  }

  public static void setPWMDutyCycle(long pwmGenerator, double dutyCycle){
	  System.out.println("PWMJNI: setPWMDutyCycle()");
  }

  public static void setPWMOutputChannel(long pwmGenerator, int pin){
	  System.out.println("PWMJNI: setPWMOutputChannel()");
  }
}
