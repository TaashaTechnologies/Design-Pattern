package com.taasha.design.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.taasha.design.pattern.abstractfactories.AbstractDriveFactory;
import com.taasha.design.pattern.enu.DriveType;
import com.taasha.design.pattern.enu.FactoryName;
import com.taasha.design.pattern.factories.Drive;
import com.taasha.design.pattern.producer.FactoryProducer;

public class AbstractFactoryApplicationRun {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryApplication.class);

	public static void getImage() {
		
		AbstractDriveFactory driveFactory = FactoryProducer.getFactory(FactoryName.DRIVE);
		Drive drive =  driveFactory.getDrive(DriveType.ONE_DRIVE); 	
		
		LOGGER.info(" Get image from one Drive :" + drive.getImage());
		
		 drive =  driveFactory.getDrive(DriveType.GOOGLE_DRIVE);
		 LOGGER.info(" Get image from google Drive :" + drive.getImage());
		
	}
}
