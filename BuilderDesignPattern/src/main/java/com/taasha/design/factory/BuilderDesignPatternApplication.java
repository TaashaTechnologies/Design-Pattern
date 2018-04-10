package com.taasha.design.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taasha.design.factory.product.Computer;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuilderDesignPatternApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);
		
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

		LOGGER.info(" Please find the Computer configuration : HDD" + computer.getHDD() + " RAM : " + computer.getRAM()
				+ " BLUETOOTH : " + computer.isBluetoothEnabled() + " GRAPHIC CARD : "
				+ computer.isGraphicsCardEnabled());
	}
}
