/**
 * 
 */
package com.poortoys.examples.designpatterns.creational.factory;

import java.util.function.Supplier;

/**
 * @author vipul
 * Enumeration above represents types of cars that support Ford & Ferrari.
 */
public enum CarType {

	FORD(Ford::new),FERRARI(Ferrari::new);
	
	private final Supplier<Car> constructor;
	
	CarType(Supplier<Car> constructor) {
		this.constructor = constructor;
	}
	
	public Supplier<Car> getConstructor() {
		return this.constructor;
	}
}
