/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

public class AccelerometerJNI extends JNIWrapper {
  public static void setAccelerometerActive(boolean active){
	  System.out.println("AccelerometerJNI: setAccelerometerActive()");
  }

  public static void setAccelerometerRange(int range){
	  System.out.println("AccelerometerJNI: setAccelerometerRange()");
  }

  public static double getAccelerometerX(){
	  System.out.println("AccelerometerJNI: getAccelerometerX()");
	  return 1;
  }

  public static double getAccelerometerY(){
	  System.out.println("AccelerometerJNI: getAccelerometerY()");
	  return 1;
  }

  public static double getAccelerometerZ(){
	  System.out.println("AccelerometerJNI: getAccelerometerZ()");
	  return 1;
  }
}
