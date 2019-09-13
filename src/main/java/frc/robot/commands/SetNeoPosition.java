package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.MotorSubsystem;

public class SetNeoPosition extends InstantCommand {
    private final double INCREMENT = 1;
    private MotorSubsystem sub;

    public SetNeoPosition(MotorSubsystem sub) {
        super();
        this.sub = sub;
        requires(sub);
    }

    @Override
    protected void initialize() {
        sub.setNeoGoal();
        sub.setNeoPosition();
    }
}