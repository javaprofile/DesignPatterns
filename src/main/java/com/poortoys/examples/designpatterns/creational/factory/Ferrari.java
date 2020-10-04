/**
 * 
 */
package com.poortoys.examples.designpatterns.creational.factory;

/**
 * @author vipul
 *
 */
public class Ferrari implements Car {

	static final String DESCRIPTION = "This is a Ferrari Car.";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
