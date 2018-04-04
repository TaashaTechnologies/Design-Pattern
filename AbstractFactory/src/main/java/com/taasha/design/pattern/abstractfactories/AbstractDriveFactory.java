package com.taasha.design.pattern.abstractfactories;

import com.taasha.design.pattern.enu.DriveType;
import com.taasha.design.pattern.factories.Drive;

public abstract class AbstractDriveFactory {

	public 	abstract Drive getDrive(DriveType driveName);
}
