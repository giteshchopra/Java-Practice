/***********************************************************************
                         

This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies

	  File Name	            :   Employee.java
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
	  Description of change : Employee class. Its type objects will be stored and put to the file.

***********************************************************************/

package com.aricent;

/**
 *	Description about the class.
 *    @deprecated
 *	@see Employee
 *	@see Employee#
 *	@version 1.0
 *	@author Gitesh Chopra
 *    @since
 */

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private float salary;
	public Employee(int argsEmpId, String argsName, String argsDesignation, float argsSalary)
	{
		// The constructor sets the various parameters of type Employee
		setEmpId(argsEmpId); 
		setName(argsName);
		setDesignation(argsDesignation);
		setSalary(argsSalary);
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
    
	public int hashCode()
    { 
    	//To ensure unique values of employees in the Set
    	return this.empId; // Every ID shall generate a unique HASH CODE for the Object
    }
    
    public boolean equals(Object args0)
    {
    	Employee employee1 = (Employee) args0; // TypeCast to Employee type
		return this.getEmpId()==employee1.getEmpId(); // Checking for equals. Different people cannot have the same ID
		/*
		 * This function will reject any Duplicate Entries
		 */
    	
    }
    
}
