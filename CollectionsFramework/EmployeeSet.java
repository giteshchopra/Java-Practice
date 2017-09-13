/***********************************************************************
                         Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies

	  File Name	            :   EmployeeList.java
	  Principal Author      	: Gitesh Chopra
	  Subsystem Name        :   Exam-2
	  Module Name           	: Test2
	  Date of First Release 	:
	  Author			:         Gitesh Chopra
	  Description           	:


	  Change History

	  Version      		: 1.0
	  Date(DD/MM/YYYY) 	: Feb 18, 2016
	  Modified by		: Gitesh Chopra
	  Description of change : Maintains the set of Employees and sorts them depending upon user input.

***********************************************************************/

package com.aricent;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
/**
 *	Description about the class.
 *    @deprecated
 *	@see EmployeeList
 *	@see EmployeeList#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class EmployeeSet {
	private HashSet<Employee> setOfEmployees = new HashSet<Employee>(); // Stores the employees based on unique ID's
	public void add(String[] argsEmployeeDetails)
	{
		int empId = Integer.parseInt(argsEmployeeDetails[0]); // First string will be the empid
		String empName = argsEmployeeDetails[1]; // Second string will be the empName
		String designation = argsEmployeeDetails[2];//third string will be the designation
		float salary = Float.parseFloat(argsEmployeeDetails[3]);//fourth string will be float
		getTheSetOfEmployees().add(new Employee(empId,empName,designation,salary));//create a new employee object and add to the set
	}
	/**
	 * @return the hashSet
	 */
	public HashSet<Employee> getTheSetOfEmployees() {
		return setOfEmployees;
	}
	public ArrayList<Employee> sort(String argsSortingCriteria)
	{
		String sortingCriteria = argsSortingCriteria;
		ArrayList<Employee> finalList = new ArrayList<Employee>(getTheSetOfEmployees());
		if(sortingCriteria.equals("name") ||sortingCriteria.equals("Name")||
				sortingCriteria.equals("n")|| sortingCriteria.equals("N"))
			//check if N or n or name or Name has been put as the criteria on command line then sort by NAME
			Collections.sort(finalList,new SortByName()); // sort
		else if (sortingCriteria.equals("salary") || sortingCriteria.equals("Salary")||
				sortingCriteria.equals("S") || sortingCriteria.equals("s"))
			//check if S or s or name or Salary or salary has been put as the criteria on command line then sort by Salrary
			Collections.sort(finalList,new SortBySalary());//sort
		return finalList; // return the sortedList
	}


}
