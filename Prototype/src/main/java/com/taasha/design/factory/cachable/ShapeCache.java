package com.taasha.design.factory.cachable;

import java.util.Hashtable;

import com.taasha.design.factory.cloneable.Shape;
import com.taasha.design.factory.impl.Circle;
import com.taasha.design.factory.impl.Rectangle;
import com.taasha.design.factory.impl.Square;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String ShapeId) {
		Shape cacheShape = shapeMap.get(ShapeId);
		return (Shape) cacheShape.clone();
	}

	public static void loadCache() {

		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);

	}

}
