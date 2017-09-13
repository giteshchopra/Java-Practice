/***********************************************************************
        
	  File Name	                : TestMainClass.java
	  Principal Author      	: Gitesh Chopra (43839)
	  Subsystem Name            : Training
	  Module Name           	: Assessment
	  Date of First Release 	: 25/01/2016
	  Author			        : Gitesh Chopra (43839)
	  Description           	:


	  Change History

	  Version      		         : 1.0
	  Date(DD/MM/YYYY) 	         : 28/01/2016
	  Modified by		         : Gitesh Chopra
	  Description of change      :

***********************************************************************/

package testBankAccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aricent.Account;
import com.aricent.Employee;
import com.aricent.Employer;

/**
 *	Description about the class.
 *  
 *	@see TestMainClass
 *	@see TestMainClass#beforeMethod()#testputInAccount()#withdrawAmount()
 *        #testemployerThread#testEmployeethread #testCheckisAliveforEmployees()
 *
 *	@version 1.0
 *	@author Gitesh Chopra
 *  @since 28/1/2016
 */

public class TestMainClass {
    
    Account account[] = new Account[1];
  //  account[0]=new Account();
    //Made an array of size 1 to test for 1 element
   Employee employee = new Employee();
   Employer employer = new Employer(account);
   Thread employeeThread = new Thread(employee);
   Thread employerThread = new Thread(employer);
   @Before
  public void beforeMethod()
   {
	   account[0]=new Account(); // To get one member of Account class to call functions
	  
   }
  
	@Test
	public void testputInAccount()
	{   
		
		account[0].setBalance(1000); // setting a balance to test
		account[0].putInAccount(1000);// Put amount into account
		assertEquals(2000,account[0].getBalance()); // check if after putting, amount is set or not
		
	}
	@Test
	public void withdrawAmount()
	{
		account[0].setBalance(1000);
		account[0].getFromAccount(1000); // withdraw
		assertEquals(0,account[0].getBalance()); // check if after withdrawal the amount is 0 
	}
	@Test
	public void testEmployerThread()
	{
		//employerThread.start();
		employerThread.setName("EmployerThread");
		//assertEquals(true,employeeThread.isAlive());
		assertEquals("EmployerThread",employerThread.getName()); // test for name
	}
	@Test
	public void testEmployeeThread()
	{
		//employeeThread.start();
		employeeThread.setName("EmployeeThread");
		//assertEquals(true,employeeThread.isAlive());
		assertEquals("EmployeeThread",employeeThread.getName()); // test for name
	}
	
	@Test
	public void CheckThreadAliveEmployer()
	{  
		employerThread.start();
		assertEquals(true,employerThread.isAlive());
		//This throws an array out of bounds exception.But the test if for alive.

	}
	@Test
	public void CheckThreadAliveEmployee1()
	{  
		employeeThread.start();
		assertEquals(true,employeeThread.isAlive());
		//This throws an array out of bounds exception.But the test if for alive.

	}

	

}// class
