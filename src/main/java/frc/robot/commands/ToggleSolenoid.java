package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.SolenoidSubsystem;

/**
 * Add your docs here.
 */
public class ToggleSolenoid extends InstantCommand {
  private int solNum;
  private SolenoidSubsystem solSub;

  /**
   * Add your docs here.
   */
  public ToggleSolenoid(SolenoidSubsystem solSub, int solNum) {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    this.solNum = solNum;
    this.solSub = solSub;

    requires(solSub);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    solSub.toggle(solNum);
  }

}
