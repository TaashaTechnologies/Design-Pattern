package com.taasha.design.factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taasha.design.factory.enu.HairColor;
import com.taasha.design.factory.enu.Profession;
import com.taasha.design.factory.telescope.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TelescopingConstructorAntiPatternApplication.class)
public class TelescopingConstructorAntiPatternApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(TelescopingConstructorAntiPatternApplication.class);

	@Before
	public void setUp() {

	}

	@Test
	public void teleScopeFactoryPattern() {

		Person manager = new Person.Builder(Profession.MAGE, "Jems").withHairColor(HairColor.BLACK).build();
		LOGGER.info(" Manager :" + manager.toString());
	}

}
