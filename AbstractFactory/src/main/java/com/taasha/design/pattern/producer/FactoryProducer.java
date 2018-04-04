package com.taasha.design.pattern.producer;

import com.taasha.design.pattern.abstractfactories.AbstractDriveFactory;
import com.taasha.design.pattern.abstractfactories.DriveFactory;
import com.taasha.design.pattern.enu.FactoryName;

public class FactoryProducer {

	public static AbstractDriveFactory getFactory(FactoryName factoryName) {
		
		AbstractDriveFactory abstractDriveFactory = null;
		
		switch (factoryName) {
		case DRIVE:
				abstractDriveFactory = new DriveFactory();
			break;

		default:
			break;
		}
		return abstractDriveFactory;
	}
}
