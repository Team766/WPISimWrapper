# WPISimWrapper
WPI library wrapper for robot simulator

A shell command that takes any code directory as a parameter, and then deploys it to the robot simulator.
After deploying, a window opens which functions as the [Driver Station](https://wpilib.screenstepslive.com/s/4485/m/24192/l/144976-frc-driver-station-powered-by-ni-labview):
  * Enable/Disable Robot
  * Change current state
  * Live video feed from onboard camera
  * Intergration for joysticks and gamepads
  * Basic controls for moving
    * Hot keys on keyboard to perform certain tasks
    * Replicates functionality of joystick buttons


##Instructions for Testing:##
Instructions on how to currenlty deploy robot code to the simulator in eclipse.
  1. Download WPISimWrapper
  2. Export the robot code with the [src](https://github.com/Team766/WPISimWrapper/tree/master/src) folder in this repository
  3. Specify the jar manifest to be the one in the [Manifest](https://github.com/Team766/WPISimWrapper/tree/master/META-INF) folder
  4. Launch the simulator
  5. Run the jar file in a command line: *java -jar Combined.jar*
