package frc.robot.subsystems;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class MotorSubsystem extends Subsystem {
    private VictorSP victorSP;
    private WPI_TalonSRX talonSRX;
    private WPI_VictorSPX victorSPX;

    public MotorSubsystem(VictorSP vSP, WPI_TalonSRX tSRX, WPI_VictorSPX vSPX) {
        victorSP = vSP;
        talonSRX = tSRX;
        victorSPX = vSPX;
    }

    @Override
    public void initDefaultCommand() {
        
    }

    public void turn(double amount) {
        victorSP.set(amount);
        talonSRX.set(amount);
        victorSPX.set(amount);
    }
}