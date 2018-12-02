package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.DoubleSolenoid;

class RobotMap {
  static ArrayList<DoubleSolenoid> solenoids;

  static {
    solenoids = new ArrayList<DoubleSolenoid>();
    solenoids.add(new DoubleSolenoid(0, 3));
    solenoids.add(new DoubleSolenoid(1, 2));
  }
}