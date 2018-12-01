package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class ActuateSolenoid extends InstantCommand {
  private int solNum;

  /**
   * Add your docs here.
   */
  public ActuateSolenoid(int n) {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.solenoids);

    solNum = n;
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if (Robot.solenoids.isOpen(solNum)) {
      Robot.solenoids.closeSolenoid(solNum);
    } else {
      Robot.solenoids.openSolenoid(solNum);
    }
  }

}
