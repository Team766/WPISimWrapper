/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

//
// base class for all JNI wrappers
//
public class JNIWrapper {
  static boolean libraryLoaded = false;
  static File jniLibrary = null;
  
  public static long getPortWithModule(byte module, byte pin){
	  System.out.println("JNIWrapper: getPortWithModule()");
	  return (module*7) + getPort(pin);
  }

  public static long getPort(byte pin){
	  System.out.println("JNIWrapper: getPort()");
	  return (long)pin;
  }

  public static void freePort(long port_pointer){
	  System.out.println("JNIWrapper: freePort()");
  }
}
