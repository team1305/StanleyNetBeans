
package org.team1305.Stanley;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    boolean invertDriveJoystickSignal = true;
    boolean invertTurnJoystickSignal = true;
    private final Joystick driveStick = new Joystick(RobotMap.JOY_ARCADE_DRIVE_MOVE_AXIS);
    
    Button btnLStick = new JoystickButton(driveStick, 11),
           btnRStick = new JoystickButton(driveStick, 12);
   

public double getDriveStickValue() {
     System.out.println("In GetDriveStick");
        if (invertDriveJoystickSignal)
        {
            return driveStick.getY() * -1;
        }
        else
        {
            return driveStick.getY();
        }
        //.getRawAxis(RobotMap.JOY_ARCADE_DRIVE_MOVE_AXIS)
    }

 public double getTurnStickValue() {
      System.out.println("In GetTurnStick");
        if (invertTurnJoystickSignal)
        {
            return driveStick.getZ() * -1;
        }
        else
        {
            return driveStick.getZ();
        }
        
 }
}