/***********************************************************************
                   

	  File Name	            :   MainClass.java
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
	  Description of change :a program that reads a csv file specified as command line argument. The row of CSV file represents an employee and have values in following order:

empid name designation salary us an appropriate collection to store all the employees and remove any duplicate records based on empid.

Sorts the records based on the parameter (salary or name ) provided as 3rd command line argument and store the output in another file which is 2nd command line argument.



***********************************************************************/

package com.aricent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 *	Description about the class.
 *    @deprecated
 *	@see MainClass
 *	@see MainClass#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class MainClass {

	/**
	 *	Description about the Method.
	 *  
	 *	@param none
	 *    @exception none
	 *    @return void
	 *    @see MainClass
	 *    @deprecated
	 *	@version 1.0
	 *	@author Gitesh Chopra
	 *    @since Feb 18, 2016
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = args[0]; // Input File will be the FirstCommandLine Argument
		String outputFile = args[1];//  Desitnation File will be the Second CommandLine Argument
		String sortingCriteria = args[2];// sortingCriteria will be the Third CommandLine Argument
		try {
		if(!(new File(inputFile).exists())) // check if the input file exists or not, in case NO ,throw FileNotFoundException
		{
			
				throw new FileNotFoundException();
			} 
		if(!(sortingCriteria.equals("name") ||sortingCriteria.equals("Name")||
				sortingCriteria.equals("n")|| sortingCriteria.equals("N") ||
				sortingCriteria.equals("salary") || sortingCriteria.equals("Salary")||
				sortingCriteria.equals("S") || sortingCriteria.equals("s")))
			throw new WrongInputException(args[2]);
		//If anything other than salary or name is mentioned throw an exception
		}//try
		catch (WrongInputException e) {
			// TODO Auto-generated catch block
			System.out.println("Wrong Input Exception" + e);
			System.exit(1); // exit the program
		
		} // catch wrong input
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.exit(1); // exit the program
		} // catch file not found
		
		EmployeeSet setOfEmployees = new EmployeeSet(); // Create a new Object of employee Set
		FileOperationsClass filesHandler= new FileOperationsClass(setOfEmployees);
		//File operations performs the read/ write functionalities.
		filesHandler.reader(inputFile); // Read the File
		ArrayList<Employee >sortedList = setOfEmployees.sort(sortingCriteria); // Sort based on the criteria
	/*	for(Employee employee : sortedList)
		{
			System.out.println(employee.getName());
		}*/
		filesHandler.write(outputFile, sortedList); // Finally write the sorted List to the file 

	} // MainClose

}//MainClass Close
