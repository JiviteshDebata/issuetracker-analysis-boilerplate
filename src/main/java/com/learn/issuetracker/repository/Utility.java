package com.learn.issuetracker.repository;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.learn.issuetracker.model.Employee;
import com.learn.issuetracker.model.Issue;

/*
 * This class has methods for parsing the String read from the files in to corresponding Model Objects
*/
public class Utility {

	private Utility() {
		// Private Constructor to prevent object creation
	}

	/*
	 * parseEmployee takes a string with employee details as input parameter and
	 * parses it in to an Employee Object
	 */
	public static Employee parseEmployee(String employeeDetail) {
		String[] str = employeeDetail.split(",");
		Employee Eobj = new Employee(Integer.parseInt(str[0]), str[1], str[2]);
		return Eobj;

	}

	/*
	 * parseIssue takes a string with issue details and parses it in to an Issue
	 * Object. The employee id in the Issue details is used to search for an an
	 * Employee, using EmployeeRepository class. If the employee is found then it is
	 * set in the Issue object. If Employee is not found, employee is set as null in
	 * Issue Object
	 */

	public static Issue parseIssue(String issueDetail) {
		String[] strArr = issueDetail.split(",");
		if (strArr[0].startsWith("IS")) {
			DateTimeFormatter DT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate CD = LocalDate.parse(strArr[2], DT);
			LocalDate ED = LocalDate.parse(strArr[3], DT);
			Optional<Employee> Oemp = EmployeeRepository.getEmployee(Integer.parseInt(strArr[6]));
			Employee e = null;

			if (Oemp.isPresent())
				e = Oemp.get();
			return new Issue(strArr[0], strArr[1], CD, ED, strArr[4], strArr[5], e);
		}
		return null;
	}
}
