/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.hal;

import java.nio.IntBuffer;
import java.nio.LongBuffer;

public class AnalogJNI extends JNIWrapper {
  /**
   * <i>declaration :
   * AthenaJava\target\native\include\HAL\Analog.h:58</i><br>
   * enum values
   */
  public static interface AnalogTriggerType {
    /**
     * <i>declaration :
     * AthenaJava\target\native\include\HAL\Analog.h:54</i>
     */
    public static final int kInWindow = 0;
    /**
     * <i>declaration :
     * AthenaJava\target\native\include\HAL\Analog.h:55</i>
     */
    public static final int kState = 1;
    /**
     * <i>declaration :
     * AthenaJava\target\native\include\HAL\Analog.h:56</i>
     */
    public static final int kRisingPulse = 2;
    /**
     * <i>declaration :
     * AthenaJava\target\native\include\HAL\Analog.h:57</i>
     */
    public static final int kFallingPulse = 3;
  };

  public static long initializeAnalogInputPort(long port_pointer){
	  System.out.println("AnalogJNI: initializeAnalogInputPort()");
	  return 1;
  }

  public static void freeAnalogInputPort(long port_pointer){
	  System.out.println("AnalogJNI: freeAnalogInputPort()");
  }

  public static long initializeAnalogOutputPort(long port_pointer){
	  System.out.println("AnalogJNI: initializeAnalogOutputPort()");
	  return 1;
  }

  public static void freeAnalogOutputPort(long port_pointer){
	  System.out.println("AnalogJNI: freeAnalogOutputPort()");
  }

  public static boolean checkAnalogModule(byte module){
	  System.out.println("AnalogJNI: checkAnalogModule()");
	  return true;
  }

  public static boolean checkAnalogInputChannel(int pin){
	  System.out.println("AnalogJNI: checkAnalogInputChannel()");
	  return true;
  }

  public static boolean checkAnalogOutputChannel(int pin){
	  System.out.println("AnalogJNI: checkAnalogOutputChannel()");
	  return true;
  }

  public static void setAnalogOutput(long port_pointer, double voltage){
	  System.out.println("AnalogJNI: setAnalogOutput()");
  }

  public static double getAnalogOutput(long port_pointer){
	  System.out.println("AnalogJNI: getAnalogOutput()");
	  return 1;
  }

  public static void setAnalogSampleRate(double samplesPerSecond){
	  System.out.println("AnalogJNI: setAnalogSampleRate()");
  }

  public static double getAnalogSampleRate(){
	  System.out.println("AnalogJNI: getAnalogSampleRate()");
	  return 1;
  }

  public static void setAnalogAverageBits(long analog_port_pointer, int bits){
	  System.out.println("AnalogJNI: setAnalogAverageBits()");
  }

  public static int getAnalogAverageBits(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogAverageBits()");
	  return 1;
  }

  public static void setAnalogOversampleBits(long analog_port_pointer, int bits){
	  System.out.println("AnalogJNI: setAnalogOversampleBits()");
  }

  public static int getAnalogOversampleBits(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogOversampleBits()");
	  return 1;
  }

  public static short getAnalogValue(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogValue()");
	  return 1;
  }

  public static int getAnalogAverageValue(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogAverageValue()");
	  return 1;
  }

  public static int getAnalogVoltsToValue(long analog_port_pointer, double voltage){
	  System.out.println("AnalogJNI: getAnalogVoltsToValue()");
	  return 1;
  }

  public static double getAnalogVoltage(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogVoltage()");
	  return 1;
  }

  public static double getAnalogAverageVoltage(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogAverageVoltage()");
	  return 1;
  }

  public static int getAnalogLSBWeight(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogLSBWeight()");
	  return 1;
  }

  public static int getAnalogOffset(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAnalogOffset()");
	  return 1;
  }

  public static boolean isAccumulatorChannel(long analog_port_pointer){
	  System.out.println("AnalogJNI: isAccumulatorChannel()");
	  return true;
  }

  public static void initAccumulator(long analog_port_pointer){
	  System.out.println("AnalogJNI: initAccumulator()");
  }

  public static void resetAccumulator(long analog_port_pointer){
	  System.out.println("AnalogJNI: resetAccumulator()");
  }

  public static void setAccumulatorCenter(long analog_port_pointer, int center){
	  System.out.println("AnalogJNI: setAccumulatorCenter()");
  }

  public static void setAccumulatorDeadband(long analog_port_pointer, int deadband){
	  System.out.println("AnalogJNI: setAccumulatorDeadband()");
  }

  public static long getAccumulatorValue(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAccumulatorValue()");
	  return 1;
  }

  public static int getAccumulatorCount(long analog_port_pointer){
	  System.out.println("AnalogJNI: getAccumulatorCount()");
	  return 1;
  }

  public static void getAccumulatorOutput(long analog_port_pointer, LongBuffer value,
      IntBuffer count){
    	  System.out.println("AnalogJNI: getAccumulatorOutput()");
      }

  public static long initializeAnalogTrigger(long port_pointer, IntBuffer index){
	  System.out.println("AnalogJNI: initializeAnalogTrigger()");
	  return 1;
  }

  public static void cleanAnalogTrigger(long analog_trigger_pointer){
	  System.out.println("AnalogJNI: cleanAnalogTrigger()");
  }

  public static void setAnalogTriggerLimitsRaw(long analog_trigger_pointer, int lower,
      int upper){
    	  System.out.println("AnalogJNI: setAnalogTriggerLimitsRaw()");
      }

  public static void setAnalogTriggerLimitsVoltage(long analog_trigger_pointer,
      double lower, double upper){
    	  System.out.println("AnalogJNI: setAnalogTriggerLimitsVoltage()");
      }

  public static void setAnalogTriggerAveraged(long analog_trigger_pointer,
      boolean useAveragedValue){
    	  System.out.println("AnalogJNI: setAnalogTriggerAveraged()");
      }

  public static void setAnalogTriggerFiltered(long analog_trigger_pointer,
      boolean useFilteredValue){
    	  System.out.println("AnalogJNI: setAnalogTriggerFiltered()");
      }

  public static boolean getAnalogTriggerInWindow(long analog_trigger_pointer){
	  System.out.println("AnalogJNI: getAnalogTriggerInWindow()");
	  return false;
  }

  public static boolean getAnalogTriggerTriggerState(long analog_trigger_pointer){
	  System.out.println("AnalogJNI: getAnalogTriggerTriggerState()");
	  return true;
  }

  public static boolean getAnalogTriggerOutput(long analog_trigger_pointer, int type){
	  System.out.println("AnalogJNI: getAnalogTriggerOutput()");
	  return true;
  }
}
