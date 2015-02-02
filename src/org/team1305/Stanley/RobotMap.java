package org.team1305.Stanley;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //PWM channels
    public static final int PWM_LEFT_DRIVE_MOTOR = 1;
    public static final int PWM_RIGHT_DRIVE_MOTOR = 3;
   // public static final int PWM_RIGHT_FRONT_DRIVE_MOTOR = 3;
 //   public static final int PWM_RIGHT_REAR_DRIVE_MOTOR = 4;
    
        //Joystick Button Mappings
   public static final int JOY_ARCADE_DRIVE_TURN_AXIS = 3;
   public static final int JOY_ARCADE_DRIVE_MOVE_AXIS = 1;
}
