// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.XboxController;


/** Add your docs here. */
public class OI {
    XboxController operatorController;
    public OI(){

    }
    // intake will work when the left bumber is press down
    public boolean intake (){
        return operatorController.getLeftBumper();
        }
    
        //robot wiwll move forward when 
    
    public double getSpeed(){
        return operatorController.getLeftY();
    }
    public double getTurn(){
        return operatorController.getRightX();
    }
    public double shooter(){
        return operatorController.getLeftTriggerAxis();
    }
}
