package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.MotorSubsystem;

public class ControlThrottleWithJoystick extends Command {
    MotorSubsystem motorSub;
    Joystick stick;
    
    public ControlThrottleWithJoystick(MotorSubsystem motorSub, Joystick stick) {
        this.motorSub = motorSub;
        this.stick = stick;

        requires(motorSub);
    }

    @Override
    protected void execute() {
        motorSub.setThrottle(stick.getY());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}