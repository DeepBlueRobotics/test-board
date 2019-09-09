package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.MotorSubsystem;

public class StopMotors extends InstantCommand {
    MotorSubsystem sub;

    public StopMotors(MotorSubsystem sub) {
        this.sub = sub;
        requires(sub);
    }

    protected void initialize() {
        sub.setThrottle(0);
    }
}