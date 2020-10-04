/**
 * 
 */
package com.poortoys.examples.designpatterns.creational.factory;

/**
 * @author vipul
 * We have static method getCar to create car objects encapsulated in the factory
 * class CarFactory
 */
public class CarFactory {

	public static Car getCar( CarType carType ) {
		return carType.getConstructor().get();
	}
}
