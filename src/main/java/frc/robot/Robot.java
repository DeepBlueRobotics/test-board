/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends TimedRobot {
  private VictorSP motor1;
  private VictorSP motor2;
  private VictorSP motor3;
  

  @Override
  public void robotInit() {
    SmartDashboard.putNumber("Speed",0);
    motor1 = new VictorSP(1);
    motor2 = new VictorSP(2);
    motor3 = new VictorSP(3);
  }

  @Override
  public void teleopPeriodic() {
    double speed=SmartDashboard.getNumber("Speed",0);
    motor1.set(speed);
    motor2.set(speed);
    motor3.set(speed);
  }
}
