package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSolenoid;
import frc.robot.commands.ControlThrottleWithJoystick;
import frc.robot.commands.SetNeoPosition;
import frc.robot.commands.StopMotors;
import frc.robot.subsystems.MotorSubsystem;
import frc.robot.subsystems.SolenoidSubsystem;

class OI {
    Joystick leftJoy;
    Joystick rightJoy;
    Joystick manipulator;

    private JoystickButton actuateSolenoid0;
    private JoystickButton actuateSolenoid1;
    private JoystickButton setNeoPos;

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
        motorSub.setDefaultCommand(new ControlThrottleWithJoystick(motorSub, leftJoy));
        setNeoPos = new JoystickButton(manipulator, 3);
        setNeoPos.whileHeld(new SetNeoPosition(motorSub)); // will this work?
        setNeoPos.whenReleased(new StopMotors(motorSub));
    }
    private class Manip {
        static final int X = 1, A = 2, B = 3, Y = 4, LB_lShoulder = 5, RB_rShoulder = 6, LT_lTrigger = 7, RT_rTrigger = 8,
            BACK = 9, START = 10;
    
        // Front four buttons look like:
        //  Y
        // X B
        //  A
      }
}