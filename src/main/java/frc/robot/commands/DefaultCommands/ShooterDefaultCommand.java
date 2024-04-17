// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.DefaultCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;

public class ShooterDefaultCommand extends Command {
  /** Creates a new ShooterDefaultCommand. */
  public ShooterDefaultCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.SHOOTER_SUBSYSTEM);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Robot.oi.shooter() > 0.3){
      Robot.SHOOTER_SUBSYSTEM.setShooterSpeed(0.4);
    }
    else if(Robot.oi.shooter() < 0.05){
      Robot.SHOOTER_SUBSYSTEM.stopShooter(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
