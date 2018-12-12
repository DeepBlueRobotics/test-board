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
    super("ToggleSolenoid" + solNum);
    this.setSubsystem("SolenoidSubsystem");
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    this.solNum = solNum;
    this.solSub = solSub;

    requires(solSub);
    System.out.println("Created ToggleSolenoid for solenoid " + solNum);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    System.out.println("Calling toggle for " + solNum);
    solSub.toggle(solNum);
  }

}
