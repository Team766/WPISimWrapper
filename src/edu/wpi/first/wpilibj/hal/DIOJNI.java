/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

public class DIOJNI extends JNIWrapper {
  public static long initializeDigitalPort(long port_pointer){
	  System.out.println("DIOJNI: initializeDigitalPort()");
	  return 0;
  }

  public static void freeDigitalPort(long port_pointer){
	  System.out.println("DIOJNI: freeDigitalPort()");
  }

  public static boolean allocateDIO(long digital_port_pointer, boolean input){
	  System.out.println("DIOJNI: allocateDIO()");
	  return true;
  }

  public static void freeDIO(long digital_port_pointer){
	  System.out.println("DIOJNI: freeDIO()");
  }

  public static void setDIO(long digital_port_pointer, short value){
	  System.out.println("DIOJNI: setDIO()");
  }

  public static boolean getDIO(long digital_port_pointer){
	  System.out.println("DIOJNI: getDIO()");
	  return true;
  }

  public static boolean getDIODirection(long digital_port_pointer){
	  System.out.println("DIOJNI: getDIODirection()");
	  return true;
  }

  public static void pulse(long digital_port_pointer, double pulseLength){
	  System.out.println("DIOJNI: pulse()");
  }

  public static boolean isPulsing(long digital_port_pointer){
	  System.out.println("DIOJNI: isPulsing()");
	  return true;
  }

  public static boolean isAnyPulsing(){
	  System.out.println("DIOJNI: isAnyPulsing()");
	  return true;
  }

  public static short getLoopTiming(){
	  System.out.println("DIOJNI: getLoopTiming()");
	  return 1;
  }
}
