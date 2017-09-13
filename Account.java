package com.aricent;
/***********************************************************************
                       

	  File Name	                : Account.java
	  Principal Author      	: Gitesh Chopra (43839)
	  Subsystem Name            : Training
	  Module Name           	: Assessment
	  Date of First Release 	: 25/01/2016
	  Author			        : Gitesh Chopra (43839)
	  Description           	: The account class reprsents the bank account.
	                              It has methods to put an amount in the account for the employer.
	                              It has a get method to fetch an amount for the employee. 
	                              If sufficient funds are not available the employee should wait
	                              till the funds become available.


	  Change History

	  Version      		         : 1.0
	  Date(DD/MM/YYYY) 	         : 25/01/2016
	  Modified by		         : Gitesh Chopra
	  Description of change      :

 ***********************************************************************/

/**
 *	Description about the class.
 *  
 *	@see Account
 *	@see Account#putInAccount(int) #getFromAccount(int)
 *	@version 1.0
 *	@author Gitesh Chopra
 *  @since 25/1/2016
 */

public class Account {
	private int balance = 0; // How much balance does the account have
	private static int objectCounter=0; // Helper static object to put in the account no
	private int accountNo;
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @return    int
	 *    @see       Account
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since    28/1/16
	 */
	public int getBalance()
	{
		return balance;
	}
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @return    void
	 *    @see       Account
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/16
	 */  
	public void setBalance(int newBalance)
	{
		balance = newBalance;
	}
	public Account()
	{
		objectCounter++; // everytime a new object is made, we get a count of its number
		accountNo = objectCounter; // assign it as the number
	}
	
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @return    void
	 *    @see       Account
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/2016
	 */
	public synchronized void putInAccount(int amount)
	{
		/*
		 * method to Inform the user that the employer is putting
		 */
	    System.out.println(Thread.currentThread().getName()+ " is putting in the account " + accountNo);
		setBalance(getBalance()+amount); // amount added
		 System.out.println( this + " has amount added, new balance being " + getBalance());
		this.notify(); // notify any account if waiting due to insufficient funds
		
	}
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @return    void
	 *    @see       Account
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/2016
	 */
	public synchronized void getFromAccount(int amount)
	{
		/*
		 * To withdraw amount from the account
		 */
		System.out.println(Thread.currentThread().getName()+
				" trying to withdraw amount : "+ amount );
		while(amount>getBalance()) // Insufficient balance case. Keep waiting - while loop
			try {
				System.out.println(Thread.currentThread().getName()+
						" has insufficient funds, Hence Waiting. " + 
						"his balance is "+ balance + " Amount needed is :" + amount);
				wait(); // make it wait
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		setBalance(getBalance()-amount); // Can reach here only if sufficient balance is there. Deduct amount
			 System.out.println(Thread.currentThread().getName()+ 
					 " has sufficient Funds "+ "Remaining Balance is : "+getBalance());
	
		
	}
	/**
	 *	Description about the Method.
	 *  
	 *	  @param     none
	 *    @exception none
	 *    @see       Account
	 *	  @version   1.0
	 *	  @author    Gitesh Chopra
	 *    @since     28/1/2016
	 */ 
	public String toString()
	{
		return "Employee No  " + accountNo; // To get which account is using
	}

}
