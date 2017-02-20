package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoBlueCenterGearShoot extends CommandGroup
{
	public AutoBlueCenterGearShoot()
	{
		 addSequential(new DriveForward(2)); //input is encoder distance until start line up
	     addSequential(new LineUpGear());
	     addSequential(new DriveForward(1)); //small distance, until gear is on peg
	     addSequential(new WaitForPilot(3));
	     addSequential(new DriveForward(.5)); //very very very small distance
	     addSequential(new WaitForPilot(10));  //change this time
	
		addSequential(new DriveBackward(2));
		addSequential(new TurnLeftFast(-90));
		addSequential(new TurnRightSlow(-90));
		addSequential(new DriveForward(.1));
		addSequential(new TurnLeftFast(-75));
		addSequential(new TurnRightSlow(-75));
		addSequential(new LineUpBoiler());
		addSequential(new Shoot());
	}
}
