/**
 * 
 */
package com.poortoys.examples.domain;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author vipul
 *
 */
public class StudentStreamApp {

	/**
	 * This method accepts a name and list of students, finds a  student by name 
	 * @param name
	 * @param students
	 * @return
	 */
	public List<Student> findStudentByName( String name,
												List<Student> students ) {
		List<Student> resultStudents = Collections.emptyList();
		if(name == null || students == null || students.isEmpty())
			return students;
		resultStudents = students.stream()
							.filter(student->student.getName().equalsIgnoreCase(name))
							.collect(Collectors.toList());
		return resultStudents;
	}
	
	/**
	 * This method finds student by his address zipcode.
	 * @param zipCode
	 * @param students
	 * @return
	 */
	public Optional<Student> findStudentByZipcode( String zipCode,
											List<Student> students ) {
		Optional<Student> studentOptional = students.stream()
							//.flatMap(Student::getAddress)
							.filter(student -> student.getAddress().getZipCode()
														.equalsIgnoreCase(zipCode))
							.findFirst();
		return studentOptional;		
				
	}
		
	public List<Student> findStudentByMobileNumber( String mobileNumber,
													List<Student> students ) {
		List<Student> resultStudents = Collections.emptyList();
		resultStudents = students.stream()
									.filter(student->student.getMobileNumbers()
													.stream()
													.anyMatch(mobile->mobile.getNumber()
																.equalsIgnoreCase(
																		mobileNumber)))
									.collect(Collectors.toList());
		return resultStudents;
	}
	
}
