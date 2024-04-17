// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.util.WPICleaner;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ChassisSubsystem. */


  WPI_VictorSPX leftMotor;

  WPI_VictorSPX rightMotor; 


  public ChassisSubsystem() {
    this.leftMotor = new WPI_VictorSPX(10);

    this.rightMotor = new WPI_VictorSPX(11);

    drive = new DifferentialDrive(null, null);
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void move (double speed, double turn){
    drive.arcadeDrive(speed, turn);
}}
