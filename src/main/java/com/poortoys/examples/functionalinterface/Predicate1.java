/**
 * 
 */
package com.poortoys.examples.functionalinterface;

import java.util.function.Predicate;

import com.poortoys.examples.domain.Student;

/**
 * @author vipul
 *
 */
public class Predicate1 {

	
	Predicate<Student> agePredicate =  (student) -> student.getAge() > 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
