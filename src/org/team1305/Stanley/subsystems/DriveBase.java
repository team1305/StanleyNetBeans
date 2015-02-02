/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.Stanley.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1305.Stanley.RobotMap;
import org.team1305.Stanley.commands.DriveInArcade;
import org.team1305.Stanley.commands.DriveStop;

/**
 *
 * @author Kim
 */
public class DriveBase extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private final RobotDrive driveBase = new RobotDrive( RobotMap.PWM_LEFT_DRIVE_MOTOR,
                                                       RobotMap.PWM_RIGHT_DRIVE_MOTOR);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
         setDefaultCommand(new DriveInArcade());
    }
    
     public void arcadeDrive(double move, double rotate) {
        driveBase.arcadeDrive(move, rotate, true);
        
    }
    public void stop(){
        driveBase.arcadeDrive(0.0, 0.0);
    }
}
