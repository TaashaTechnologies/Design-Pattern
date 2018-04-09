package com.taasha.design.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taasha.design.factory.enu.HairColor;
import com.taasha.design.factory.enu.Profession;
import com.taasha.design.factory.telescope.Person;

@SpringBootApplication
public class TelescopingConstructorAntiPatternApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(TelescopingConstructorAntiPatternApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TelescopingConstructorAntiPatternApplication.class, args);

		Person manager = new Person.Builder(Profession.MAGE, "Jems").withHairColor(HairColor.BLACK).build();
		LOGGER.info(" Manager :" + manager.toString());
		
	}
}
