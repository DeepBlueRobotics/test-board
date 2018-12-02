package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.SolenoidSubsystem;

/**
 * Add your docs here.
 */
public class ActuateSolenoid extends InstantCommand {
  private int solNum;
  private SolenoidSubsystem solSub;

  /**
   * Add your docs here.
   */
  public ActuateSolenoid(SolenoidSubsystem solSub, int n) {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(solSub);

    solNum = n;
    this.solSub = solSub;
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if (solSub.isOpen(solNum)) {
      solSub.closeSolenoid(solNum);
    } else {
      solSub.openSolenoid(solNum);
    }
  }

}
