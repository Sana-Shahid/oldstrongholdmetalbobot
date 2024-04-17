// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  WPI_VictorSPX shootingMotor;
  
  public ShooterSubsystem() {

    this.shootingMotor = new WPI_VictorSPX(12);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
public void setShooterSpeed(double speed){
  shootingMotor.set(speed);
}

public void stopShooter(double speed){
  setShooterSpeed.set(0);
}

