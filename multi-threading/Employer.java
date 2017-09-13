package com.aricent;
import java.util.Random;

/***********************************************************************
                

	  File Name	                : Employer.java
	  Principal Author      	: Gitesh Chopra (43839)
	  Subsystem Name            : Training
	  Module Name           	: Assessment
	  Date of First Release 	: 25/01/2016
	  Author			        : Gitesh Chopra (43839)
	  Description           	:


	  Change History

	  Version      		         : 1.0
	  Date(DD/MM/YYYY) 	         : 25/01/2016
	  Modified by		         : Gitesh Chopra
	  Description of change      : Employer class. The employer gets access to
	                               all the accounts and puts amount in the accounts.

 ***********************************************************************/

/**
 *	Description about the class.
 *  
 *	@see Employer
 *	@see Employer#run()
 *	@version 1.0
 *	@author Gitesh Chopra
 *  @since 28/1/2016
 */

public class Employer implements Runnable{
	private Account[]account;
	private Random random;
	private final int noOfTimes=10;
	private final int noOfAccounts=5;
	/*
	 * Constructor to tell the employer about all the accounts
	 */
	public Employer(Account[] account)
	{
		this.account = account;
		random = new Random();
	}

	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @see       Employer
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/2016
	 */
	public void run()
	{
		
		int counter=0;
		for(int i=0; i<noOfTimes;i++)// Should put in the account ATLEAST TWICE
		{
			if(counter>(noOfAccounts-1)) // To restart counting if index limits are crossed
				counter=0;
		account[counter].putInAccount(random.nextInt(5000)+1000); 
		/* Putting a random salary to the account between 1000-5999*/
		counter++; // increment counter
		/* in place of for we can also keep putting infinitely
		 * while(true)
		 */
	}
	
		
	}

}
