/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj;

import edu.wpi.first.wpilibj.util.BaseSystemNotInitializedException;
import com.team766.simulator.Controller;

public class RobotState {
  private static Interface impl;

  public static void SetImplementation(Interface i) {
    impl = i;
  }

  public static boolean isDisabled() {
	  return Controller.getDisabled();
  }

  public static boolean isEnabled() {
	  return Controller.getEnabled();
  }

  public static boolean isOperatorControl() {
	  return Controller.getOperatorControl();
  }

  public static boolean isAutonomous() {
	  return Controller.getAutonomous();
  }

  public static boolean isTest() {
	  return Controller.getTest();
  }

  interface Interface {
    boolean isDisabled();

    boolean isEnabled();

    boolean isOperatorControl();

    boolean isAutonomous();

    boolean isTest();
  }
}
