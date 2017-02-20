package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoBlueLeftGearShoot extends CommandGroup
{
	public AutoBlueLeftGearShoot()
	{
        addSequential(new DriveForward(1)); //input is encoder distance until start line up
        addSequential(new TurnRightFast(65)); //input is angle we want to turn, I think it's around 65 degrees
        addSequential(new TurnLeftSlow(65)); //have to figure out distance
        addSequential(new LineUpGear());
        addSequential(new DriveForward(1)); //small distance, until gear is on peg
        addSequential(new WaitForPilot(3));
        addSequential(new DriveForward(.1)); //very very very small distance
        addSequential(new WaitForPilot(5));  
		
		addSequential(new DriveBackward(1));
		addSequential(new TurnRightFast(160)); //almost 180, turn around to the boiler
		addSequential(new TurnLeftSlow(160));
		addSequential(new DriveForward(1));
		addSequential(new LineUpBoiler());
		addSequential(new Shoot());
	}
}
