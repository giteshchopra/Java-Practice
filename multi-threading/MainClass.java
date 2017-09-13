package com.aricent;
/***********************************************************************
         

	  File Name	                : MainClass.java
	  Principal Author      	: Gitesh Chopra (43839)
	  Subsystem Name            : Training
	  Module Name           	: Assessment
	  Date of First Release 	: 25/01/2016
	  Author			        : Gitesh Chopra (43839)
	  Description           	: The main Class Creates various objects of Employee and Account
	                              Class. Each Employee is assigned an account. A separate thread
	                              is made for each employee.


	  Change History

	  Version      		         : 1.0
	  Date(DD/MM/YYYY) 	         : 25/01/2016
	  Modified by		         : Gitesh Chopra
	  Description of change      :

 ***********************************************************************/

/**
 *	Description about the class.
 *  
 *	@see MainClass
 *	@see MainClass#main(String[])
 *	@version 1.0
 *	@author Gitesh Chopra
 *  @since 28/1/2016
 */

public class MainClass {

	/**
	 *	Description about the Method.
	 *  
	 *	  @param     name description
	 *    @exception name description
	 *    @return    void
	 *    @see       MainClass
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since    28/1/2016
	 */

	public static void main(String[] args) {
		final int numberOfEmployees=5;
		/*
		 * Created an Array of 5 Objects everywhere for ease of output
		 * can be easily changed to 100 by changing the value of numberOfEmployees.
		 */
		Account[] account = new Account[numberOfEmployees];	// Array of Account Class Objects
		Employee[] employee = new Employee[numberOfEmployees]; // Array of employee Class Objects
		Thread[] EmployeeThreads = new Thread[numberOfEmployees]; // Creating separate threads
		/*
		 * For Loop to initialize Employees their respective nos and initialize accounts
		 * of the same no for ease of usage.
		 */
		for(int i=0;i<numberOfEmployees;i++)
		{   account[i] = new Account();
			employee[i] = new Employee(account[i]);
			EmployeeThreads[i] = new Thread(employee[i]);
			EmployeeThreads[i].setName("Employee no :"+(i+1));
			
		} // for close
		Employer employer = new Employer(account);
		Thread employerThread = new Thread(employer); // Employer Thread
		employerThread.setName("employer");
		employerThread.start();
		for(int i=0;i<numberOfEmployees;i++)
			EmployeeThreads[i].start(); // Start all threads now
		

	} // main close

}// class close
