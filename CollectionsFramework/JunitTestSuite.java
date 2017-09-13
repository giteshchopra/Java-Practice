/***********************************************************************
          

	  File Name	            :   TestSuite.java
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


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *	Description about the class.
 *    @deprecated
 *	@see TestSuite
 *	@see TestSuite#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
   EmployeeSetTest.class,
   FileOperationsClassTest.class
})
public class JunitTestSuite {   
	// To make a a Test Suite
}  	

