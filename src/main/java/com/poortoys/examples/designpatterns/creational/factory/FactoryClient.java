/**
 * 
 */
package com.poortoys.examples.designpatterns.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author vipul
 *
 */
public class FactoryClient {

	 private static Logger logger = LoggerFactory.getLogger(FactoryClient.class);
	public static void main( String[] args ) {
		Car car1 = CarFactory.getCar( CarType.FORD );
		Car car2 = CarFactory.getCar( CarType.FERRARI );
		logger.info(car1.getDescription());
		logger.info(car2.getDescription());
	}
	
}
