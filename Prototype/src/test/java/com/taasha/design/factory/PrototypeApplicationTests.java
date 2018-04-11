package com.taasha.design.factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taasha.design.factory.cachable.ShapeCache;
import com.taasha.design.factory.cloneable.Shape;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeApplication.class);

	@Before
	public void setUp() {
		ShapeCache.loadCache();
	}

	@Test
	public void factoryPattern() {

		Shape cirlceShape = (Shape) ShapeCache.getShape("1");
		LOGGER.info("Shape : " + cirlceShape.getType());

		Shape squareShape = (Shape) ShapeCache.getShape("2");
		LOGGER.info("Shape : " + squareShape.getType());

		Shape rectangleShape = (Shape) ShapeCache.getShape("3");
		LOGGER.info("Shape : " + rectangleShape.getType());

	}

}
