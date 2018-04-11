package com.taasha.design.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taasha.design.factory.cachable.ShapeCache;
import com.taasha.design.factory.cloneable.Shape;

@SpringBootApplication
public class PrototypeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
		ShapeCache.loadCache();

		Shape cirlceShape = (Shape) ShapeCache.getShape("1");
		LOGGER.info("Shape : " + cirlceShape.getType());

		Shape squareShape = (Shape) ShapeCache.getShape("2");
		LOGGER.info("Shape : " + squareShape.getType());

		Shape rectangleShape = (Shape) ShapeCache.getShape("3");
		LOGGER.info("Shape : " + rectangleShape.getType());
	}
}
