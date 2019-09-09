package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;

public class MotorSubsystem extends Subsystem {
    private VictorSP victorSP;
    private WPI_TalonSRX talonSRX;
    private WPI_VictorSPX victorSPX;
    private CANSparkMax sparkMax;
    private double goal;

    public MotorSubsystem(VictorSP vSP, WPI_TalonSRX tSRX, WPI_VictorSPX vSPX, CANSparkMax max) {
        victorSP = vSP;
        talonSRX = tSRX;
        victorSPX = vSPX;
        sparkMax = max;
        sparkMax.getEncoder().setPosition(0);
        goal = 0;
        SmartDashboard.putNumber("Neo Position", 0);
        SmartDashboard.putNumber("Neo Goal", 0);
    }

    @Override
    public void initDefaultCommand() {
        
    }

    public void setThrottle(double amount) {
        victorSP.set(amount);
        talonSRX.set(amount);
        victorSPX.set(amount);
        sparkMax.set(amount);
    }

    public void setNeoPosition() {
        sparkMax.getPIDController().setReference(goal, ControlType.kPosition);
        SmartDashboard.putNumber("Neo Position", sparkMax.getEncoder().getPosition());
    }

    public void changeNeoGoal() {
        goal += 0.5;
        SmartDashboard.putNumber("Neo Goal", goal);
    }
}