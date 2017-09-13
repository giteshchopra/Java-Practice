/***********************************************************************

	  File Name	            :   FileOperationsClassTest.java
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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;






import org.junit.Before;
import org.junit.Test;

import com.aricent.Employee;
import com.aricent.FileOperationsClass;

/**
 *	Description about the class.
 *    @deprecated
 *	@see FileOperationsClassTest
 *	@see FileOperationsClassTest#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class FileOperationsClassTest {
    String fileName;
    FileOperationsClass fileHandler;
    ArrayList<Employee> list;
	@Before
	public void initializer () { 
		fileHandler = new FileOperationsClass();// file handler class object
		fileName = "output.txt"; // Make an outputfile to write to
		list = new ArrayList<Employee>();// make a list of objects of type EMployee
		list.add(new Employee(1,"gitesh","boss",10000)); 
		list.add(new Employee(2,"Soham","boss",10000));
	}
	@Test
	public void testWrite()
	{//Check if the FileOperations Class is succesfully writing to the file or not
		try {
			fileHandler.write(fileName,list);
			BufferedReader readerObject = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String readLine = readerObject.readLine(); // if any line is found means writing is done successfully
			assertEquals(readLine!=null,true);
			readerObject.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
