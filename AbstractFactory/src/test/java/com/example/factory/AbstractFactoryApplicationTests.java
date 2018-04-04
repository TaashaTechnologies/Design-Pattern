package com.example.factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taasha.design.pattern.AbstractFactoryApplication;
import com.taasha.design.pattern.abstractfactories.AbstractDriveFactory;
import com.taasha.design.pattern.enu.DriveType;
import com.taasha.design.pattern.enu.FactoryName;
import com.taasha.design.pattern.factories.Drive;
import com.taasha.design.pattern.producer.FactoryProducer;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AbstractFactoryApplication.class)
public class AbstractFactoryApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractFactoryApplication.class);
	
	@Before
	public void setUp() {

	}
	
	@Test
	public void factoryPattern() {
		
		AbstractDriveFactory driveFactory = FactoryProducer.getFactory(FactoryName.DRIVE);
		Drive drive =  driveFactory.getDrive(DriveType.ONE_DRIVE); 	
		
		LOGGER.info(" Get image from one Drive :" + drive.getImage());
		
		 drive =  driveFactory.getDrive(DriveType.GOOGLE_DRIVE);
		 LOGGER.info(" Get image from google Drive :" + drive.getImage());
	}

}
