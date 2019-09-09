package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

class RobotMap {
  static ArrayList<DoubleSolenoid> solenoids;

  static WPI_TalonSRX talon;
  static WPI_VictorSPX victorSPX;
  static VictorSP victorSP;
  static CANSparkMax sparkMax;

  static {
    solenoids = new ArrayList<DoubleSolenoid>();
    solenoids.add(new DoubleSolenoid(0, 3));
    solenoids.add(new DoubleSolenoid(1, 2));

    talon = new WPI_TalonSRX(1);
    victorSPX = new WPI_VictorSPX(3);
    victorSP = new VictorSP(9);
    sparkMax = new CANSparkMax(0, MotorType.kBrushless);
  }
}