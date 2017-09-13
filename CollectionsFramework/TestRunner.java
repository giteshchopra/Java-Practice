/***********************************************************************
               

	  File Name	            :   TestRunner.java
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
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *	Description about the class.
 *    @deprecated
 *	@see TestRunner
 *	@see TestRunner#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class TestRunner {
	// Class to run all the test cases
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(JunitTestSuite.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString()); // In case of any failiure
	      }
	      System.out.println(result.wasSuccessful()); // print if all test cases are succesful
	   }
	}  	