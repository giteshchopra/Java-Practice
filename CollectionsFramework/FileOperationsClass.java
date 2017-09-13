/***********************************************************************
            

	  File Name	            :   FileOperationsClass.java
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
	  Description of change : Various operations on file,  such as read, write. Read from file and write to the file.

***********************************************************************/

package com.aricent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *	Description about the class.
 *    @deprecated
 *	@see FileOperationsClass
 *	@see FileOperationsClass#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class FileOperationsClass {
	private EmployeeSet setOfEmployees; // Reference to the setOfEmployees
	private File file; // File Object which will be used over and again
    FileOperationsClass(EmployeeSet argsSetOfEmployees)
    {
    	this.setOfEmployees = argsSetOfEmployees; // initialize the setOfEmployees object
    	
    } // Parameterized constructor
    public FileOperationsClass()
    {
    	//Default constructor  for TESTING
    } 

	public void reader(String argsFileToBeRead)
	{
		
		try {
			setFile(new File(argsFileToBeRead)); // Set the file to be read
			BufferedReader readerObject = new BufferedReader(new InputStreamReader(new FileInputStream(argsFileToBeRead)));
			while(true)
	        {
	            String row = readerObject.readLine(); // Read a row at a time
	            if(row==null)
	                break;
	            setOfEmployees.add(columnsFromRows(row)); // Add Each row to the set of Employees
	       
	        }//end of while loop
			readerObject.close(); // Close the reader
			
		}//try 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}//catch - FIlENOTFOUND 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch IOEXCEPTION
	}//close Reader
 String[] columnsFromRows(String row)
 {
	 String[] columns = row.split(","); // CSV file, split based on commas
     //for(int i=0;i<columns.length;i++)
     //	System.out.println(columns[i]);
     return columns; // returns columns in a string array
 }//close columnsFromRows Method
 public void write(String argsFileToWriteTo,List<Employee> sortedList)
 {
	 try {
		 setFile(new File(argsFileToWriteTo));
		PrintWriter writer = new PrintWriter(getFile());
	//	writer.write("ID"+"Name"+"Designation      "+"Salary"+ "\n");
		for(Employee employee : sortedList)
		{
			writer.write(employee.getEmpId()+","+employee.getName()+
					" ,"+employee.getDesignation()+","+employee.getSalary()+"\n");
			//Write each row to the file
			
		}//for Loop close
		writer.close();
		
	}//try block close 
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//catch block close
 }//write method close

/**
 * @return the file
 */
public File getFile() {
	return file;
}

/**
 * @param file the file to set
 */
public void setFile(File file) {
	this.file = file;
}
} // end of class
	
