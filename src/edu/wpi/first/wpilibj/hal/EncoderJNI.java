/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

import java.nio.IntBuffer;

public class EncoderJNI extends JNIWrapper {
  public static long initializeEncoder(byte port_a_module, int port_a_pin,
      boolean port_a_analog_trigger, byte port_b_module, int port_b_pin, boolean port_b_analog_trigger,
      boolean reverseDirection, IntBuffer index){
	  System.out.println("EncoderJNI: initializeEncoder()");
	  return 1;
  }

  public static void freeEncoder(long encoder_pointer){
	  System.out.println("EncoderJNI: freeEncoder()");
  }

  public static void resetEncoder(long encoder_pointer){
	  System.out.println("EncoderJNI: resetEncoder()");
  }

  public static int getEncoder(long encoder_pointer){
	  System.out.println("EncoderJNI: getEncoder()");
	  return 0;
  }

  public static double getEncoderPeriod(long encoder_pointer){
	  System.out.println("EncoderJNI: getEncoderPeriod()");
	  return 1;
  }

  public static void setEncoderMaxPeriod(long encoder_pointer, double maxPeriod){
	  System.out.println("EncoderJNI: setEncoderMaxPeriod()");
  }

  public static boolean getEncoderStopped(long encoder_pointer){
	  System.out.println("EncoderJNI: getEncoderStopped()");
	  return true;
  }

  public static boolean getEncoderDirection(long encoder_pointer){
	  System.out.println("EncoderJNI: getEncoderDirection()");
	  return true;
  }

  public static void setEncoderReverseDirection(long encoder_pointer,
      boolean reverseDirection){
    	  System.out.println("EncoderJNI: setEncoderReverseDirection()");
      }

  public static void setEncoderSamplesToAverage(long encoder_pointer,
      int samplesToAverage){
    	  System.out.println("EncoderJNI: setEncoderSamplesToAverage()");
      }

  public static int getEncoderSamplesToAverage(long encoder_pointer){
	  System.out.println("EncoderJNI: getEncoderSamplesToAverage()");
	  return 1;
  }

  public static void setEncoderIndexSource(long digital_port, int pin,
      boolean analogTrigger, boolean activeHigh, boolean edgeSensitive){
    	  System.out.println("EncoderJNI: setEncoderIndexSource()");
      }
}
