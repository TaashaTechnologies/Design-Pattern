package com.taasha.design.factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taasha.design.factory.product.Computer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BuilderDesignPatternApplication.class)
public class BuilderDesignPatternApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuilderDesignPatternApplication.class);

	@Before
	public void setUp() {

	}
	
	@Test
	public void factoryPattern() {

		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

		LOGGER.info(" Please find the Computer configuration : HDD" + computer.getHDD() + " RAM : " + computer.getRAM()
				+ " BLUETOOTH : " + computer.isBluetoothEnabled() + " GRAPHIC CARD : "
				+ computer.isGraphicsCardEnabled());
	}

}
