/***********************************************************************
      
	  File Name	            :   WrongInputException.java
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
	  Description of change : Exception class in case a user enters values other than Name or Salary as
	                           sorting criteria

***********************************************************************/

package com.aricent;

/**
 *	Description about the class.
 *    @deprecated
 *	@see WrongInputException
 *	@see WrongInputException#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

 public class WrongInputException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	WrongInputException(String argsName)
	{
		this.name = argsName;
	}

	public String toString()
	{
		return " Input other than 'name' or 'salary' was given  "+ name;
	}
	// user Defined exception in case an input other than name or salary is given
	

}
