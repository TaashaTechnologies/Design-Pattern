package com.taasha.design.pattern.abstractfactories;

import com.taasha.design.pattern.enu.DriveType;
import com.taasha.design.pattern.factories.Drive;
import com.taasha.design.pattern.impl.GoogleDrive;
import com.taasha.design.pattern.impl.OneDrive;

public class DriveFactory extends AbstractDriveFactory {

	@Override
	public Drive getDrive(DriveType driveName) {

		Drive drive = null;
		switch (driveName) {
		case ONE_DRIVE:
			drive = new OneDrive();
			break;
		case GOOGLE_DRIVE:
			drive = new GoogleDrive();
			break;
		}
		return drive;
	}
}
