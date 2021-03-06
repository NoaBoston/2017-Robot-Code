package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoBlueBoilerGearShoot extends CommandGroup
{
	public AutoBlueBoilerGearShoot()
	{
		addSequential(new DriveBackward(62.95));
    	addSequential(new TurnRightFast(59.42));
    	addSequential(new TurnLeftSlow(59.42));
    	addSequential(new DriveBackward(83.48));
        //addSequential(new LineUpGear());
        //addSequential(new DriveForward(1)); //small distance, until gear is on peg
        //addSequential(new WaitForPilot(3));
        //addSequential(new DriveForward(.1)); //very very very small distance
        addSequential(new WaitForPilot(5));  
		
		addSequential(new DriveForward(18.5));
		addSequential(new TurnRightFast(59.24)); //almost 180, turn around to the boiler
		addSequential(new TurnLeftSlow(59.24));
		addSequential(new DriveForward(96.38));
		addSequential(new TurnLeftFast(-74.79));
		addSequential(new TurnRightSlow(-74.79));
		addSequential(new DriveForward(27));
		//addSequential(new LineUpBoiler());
		//addSequential(new Shoot());
	}
}
