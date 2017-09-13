/***********************************************************************
                  
	  File Name	            :   MainClassTest.java
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
	  Description of change :

***********************************************************************/

package TestPackage;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.aricent.MainClass;
import com.aricent.WrongInputException;

/**
 *	Description about the class.
 *    @deprecated
 *	@see MainClassTest
 *	@see MainClassTest#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */
/*
 * @Test(expected = IllegalArgumentException.class)
public void testMainWithBadCommandLine()
{
     YourClass.main(new String[] { "NaN" });
}
 */
public class MainClassTest {
	boolean flag;
	@Before
	public void checker()
	{
		flag=false;
	}
	@Test(expected = WrongInputException.class)

	public void testMainWithBadCommandLine()
 	{   
		try
 	   { 
	     MainClass.main(new String[] { "input.csv","anything","" }); // Test if blank or
	                                                                  //arguments other than n or s are given
 	   }catch(WrongInputException e)
 	   {
 		   flag =true;
 	   }
		assertEquals(flag,true);
	}

	
	@Test(expected = FileNotFoundException.class)
	public void testMainForWrongInpu1t() // Method to test if a wrong filename is put an exception is thrown
	{
		boolean exceptionThrown = false;
		try{
		MainClass.main (new String[] { "badFile","outputfile","n" });
		}//try
		catch(Exception e)
		{
			exceptionThrown = true;
			
		} // catch
		assertEquals(exceptionThrown,true);
	} // method
	

}//class

	


