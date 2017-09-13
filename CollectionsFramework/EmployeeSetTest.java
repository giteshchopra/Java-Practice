/***********************************************************************
                         Aricent Technologies Proprietary

This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies

	  File Name	            :   EmployeeSetTest.java
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

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aricent.Employee;
import com.aricent.EmployeeSet;

/**
 *	Description about the class.
 *    @deprecated
 *	@see EmployeeSetTest
 *	@see EmployeeSetTest#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class EmployeeSetTest {
	EmployeeSet set = new EmployeeSet();
	String expectedOutput;
	@Before
	public void initializerMethod()
	{ //Initialize variables that will be used
		 expectedOutput = "";
		set.add(new String[] { "10","Gitesh","Chopra","1000" });
		set.add(new String[] { "11","Soham","Adhikari","600" });
		set.add(new String[] { "12","Arif","BHhaii","606" });
	}
	@After
	public void freeResources()
	{ // After every method free up the resources
		set = null; // Free up resources after each method
		expectedOutput=null;
	}
	@Test
	public void testSortByName()
	{ // To check if sorting by Name works as Expected or NOT
		
		ArrayList<Employee> list = set.sort("Name");
		for(Employee employee : list)
		{
			expectedOutput+=employee.getName(); // add to the resultant output string
		}
		assertEquals("ArifGiteshSoham",expectedOutput);
	} 
	@Test
	public void testSortBySalary()
	{ // To check if sorting by Salary works
		ArrayList<Employee> list = set.sort("salary");
		for(Employee employee : list)
		{
			expectedOutput+=employee.getName();
		}
		assertEquals("GiteshArifSoham",expectedOutput);
	}

}
