package frc.robot.subsystems;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class SolenoidSubsystem extends Subsystem {
  private ArrayList<DoubleSolenoid> solenoids;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public SolenoidSubsystem (ArrayList<DoubleSolenoid> solenoids) {
    super("SolenoidSubsystem");
    this.solenoids = solenoids;
    for(int s = 0; s < solenoids.size(); s++) {
      DoubleSolenoid sol = solenoids.get(s);
      sol.setName("SolenoidSubsystem", "Solenoid" + s);
    }
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void toggle(int solNum) {
    if (isOpen(solNum)) {
      close(solNum);
    } else {
      open(solNum);
    }
  }

  public boolean close(int n) {
    if (n < 0 || n >= solenoids.size()) {
      return false;
    } else {
      if (isOpen(n))
        solenoids.get(n).set(DoubleSolenoid.Value.kReverse);
      
      return true;
    }
  }

  public boolean open(int n) {
    if (n < 0 || n >= solenoids.size()) {
      return false;
    } else {
      if (!isOpen(n))
        solenoids.get(n).set(DoubleSolenoid.Value.kForward);
      
      return true;
    }
  }

  public boolean isOpen(int n) {
    return solenoids.get(n).get() == DoubleSolenoid.Value.kForward;
  }
}
