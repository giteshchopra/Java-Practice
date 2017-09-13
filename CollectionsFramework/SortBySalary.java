/***********************************************************************
                      

	  File Name	            :   SortBySalary.java
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
	  Description of change : To sort by Salary

***********************************************************************/

package com.aricent;

import java.util.Comparator;

/**
 *	Description about the class.
 *    @deprecated
 *	@see SortBySalary
 *	@see SortBySalary#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		
    	return Float.valueOf(employee2.getSalary()).compareTo(Float.valueOf(employee1.getSalary()));
    	//Compare the salaries and return 1 , 0 or -1
	}


}
