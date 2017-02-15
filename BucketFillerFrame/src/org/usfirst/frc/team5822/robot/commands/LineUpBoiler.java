package org.usfirst.frc.team5822.robot.commands;

import org.usfirst.frc.team5822.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LineUpBoiler extends Command {

	Timer timer = new Timer();
	
    public LineUpBoiler() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("lining up with boiler");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		if (timer.get() < 5)
			return false;
		return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("lined up with boiler");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
