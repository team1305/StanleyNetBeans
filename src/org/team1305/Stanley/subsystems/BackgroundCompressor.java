/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team1305.Stanley.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1305.Stanley.RobotMap;


/**
 *
 * @author Kim
 */
public class BackgroundCompressor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final Compressor compressor;
    private static BackgroundCompressor instance;

    private BackgroundCompressor() {
        //Initialize the compressor and start it once the instance is created.
        compressor = new Compressor (RobotMap.DIO_COMPRESSOR_SWITCH, RobotMap.RELAY_COMPRESSOR);
        //compressor2 = new Compressor(pressureSwitchChannel, compressorRelayChannel);
        System.out.println(compressor.getPressureSwitchValue());
        compressor.start();
        System.out.println("Compressor started");
    }


//Get the singleton instance of the compressor.
    public static BackgroundCompressor getInstance() {
        if (instance == null) {
            instance = new BackgroundCompressor();
        }
        return instance;
    }

    protected void initDefaultCommand() {
    }
}
