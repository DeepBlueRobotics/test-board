package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSolenoid;
import frc.robot.commands.TurnMotor;
import frc.robot.subsystems.MotorSubsystem;
import frc.robot.subsystems.SolenoidSubsystem;

class OI {
    Joystick leftJoy;
    
    Joystick rightJoy;
    
    Joystick manipulator;
    private JoystickButton actuateSolenoid0;
    private JoystickButton actuateSolenoid1;

    OI(SolenoidSubsystem solSub, MotorSubsystem motorSub) {
        /* LEFT JOYSTICK */
        leftJoy = new Joystick(0);

        /* RIGHT JOYSTICK */
        rightJoy = new Joystick(1);
         
        /* MANIPULATOR */
        manipulator = new Joystick(2);
        
        actuateSolenoid0 = new JoystickButton(manipulator, 1);
        actuateSolenoid0.whenPressed(new ToggleSolenoid(solSub, 0));
        actuateSolenoid1 = new JoystickButton(manipulator, 2);
        actuateSolenoid1.whenPressed(new ToggleSolenoid(solSub, 1));
        motorSub.setDefaultCommand(new TurnMotor(motorSub, leftJoy));
        
    }
}