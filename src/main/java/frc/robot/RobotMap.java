package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

class RobotMap {
  static ArrayList<DoubleSolenoid> solenoids;

  static WPI_TalonSRX talon;
  static WPI_VictorSPX victorSPX;
  static VictorSP victorSP;

  static {
    solenoids = new ArrayList<DoubleSolenoid>();
    solenoids.add(new DoubleSolenoid(0, 3));
    solenoids.add(new DoubleSolenoid(1, 2));

    talon = new WPI_TalonSRX(0);
    victorSPX = new WPI_VictorSPX(1);
    victorSP = new VictorSP(2);
  }
}