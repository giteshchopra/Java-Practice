package com.aricent;
import java.util.Random;

/***********************************************************************
             
	  File Name	                : Employee.java
	  Principal Author      	: Gitesh Chopra (43839)
	  Subsystem Name            : Training
	  Module Name           	: Assessment
	  Date of First Release 	: 25/01/2016
	  Author			        : Gitesh Chopra (43839)
	  Description           	: Employee class represents the employee. Each Employee has
	                              an account. The employee tries to withdraw some amount. 
	                              He gets a chance to withdraw twice - which is changeable.


	  Change History

	  Version      		         : 1.0
	  Date(DD/MM/YYYY) 	         : 25/01/2016
	  Modified by		         : Gitesh Chopra
	  Description of change      :

 ***********************************************************************/

/**
 *	Description about the class.
 *  
 *	@see Employee
 *	@see Employee#run()
 *	@version 1.0
 *	@author Gitesh Chopra
 *  @since 25/1/2016
 */

public class Employee implements Runnable {
	private Account account;
	private Random random;
	private final int numberOfTimes=2;
	 public Employee()
	{
		
	}
	Employee(Account account)
	{
		this.account = account; // Assign an account to each employee
		random = new Random(); 
		
	}
	
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     name description
	 *    @exception name description
	 *    @see       Employee
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/2016
	 */
	public void run()
	{
		
//	
			for(int i=0;i<numberOfTimes;i++) // Every account gets a chance to withdraw twice
				// numberOfTimes to Withdraw. Variable given value 2. Can be changed.
				/*
				 * We can also put an infinte loop. To keep trying, provided
				 *  employer puts infinite times
				 * while(true)
				 */
		    account.getFromAccount(random.nextInt(2000)); // Try to fetch an amount between 0-1999
//	}
	}

}
