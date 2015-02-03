/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.Stanley.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1305.Stanley.RobotMap;
import org.team1305.Stanley.commands.RaiseLowerArm;


/**
 *
 * @author Kim
 */
public class Arm extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final Victor upperMotor = new Victor(RobotMap.PWM_UPPER_ARM_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
         setDefaultCommand(new RaiseLowerArm());
    }
    
     public void raiseLowerArm(double power) {
        upperMotor.set(power); 
        
    }
    public void stop(){
        upperMotor.set(0); 
    }
}
