package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ActuateSolenoid;

class OI {
    static Joystick leftJoy;
    
    static Joystick rightJoy;
    
    static Joystick manipulator;
    private static JoystickButton actuateSolenoid0;
    private static JoystickButton actuateSolenoid1;

    static {
        /* LEFT JOYSTICK */
        leftJoy = new Joystick(0);

        /* RIGHT JOYSTICK */
        rightJoy = new Joystick(1);
         
        /* MANIPULATOR */
        manipulator = new Joystick(2);
        
        actuateSolenoid0 = new JoystickButton(manipulator, 1);
        actuateSolenoid0.whenPressed(new ActuateSolenoid(Robot.solSub, 0));
        actuateSolenoid1 = new JoystickButton(manipulator, 2);
        actuateSolenoid1.whenPressed(new ActuateSolenoid(Robot.solSub, 1));
    }
}