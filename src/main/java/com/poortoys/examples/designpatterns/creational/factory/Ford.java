/**
 * 
 */
package com.poortoys.examples.designpatterns.creational.factory;

/**
 * @author vipul
 *
 */
public class Ford implements Car {

	static final String DESCRIPTION = "This is a Ford Car.";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
