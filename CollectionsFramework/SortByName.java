/***********************************************************************
                     

	  File Name	            :   SortByName.java
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
	  Description of change : To sort By name
 
***********************************************************************/

package com.aricent;

import java.util.Comparator;

/**
 *	Description about the class.
 *    @deprecated
 *	@see SortByName
 *	@see SortByName#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class SortByName implements Comparator<Employee>{
	
	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
    	return employee1.getName().compareTo(employee2.getName()); // Return 0 if names are equal, 1 or -1 depending upon which is larger
	}

}
