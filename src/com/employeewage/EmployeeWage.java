package com.employeewage;
/*
 * --------------------Employee Wage Computation Program--------------------
 *Print Welcome message
 *-> Check Employee is Present or Absent
 *
 **/

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program..|");
		int employeePresent = 1;
		int random = (int) (Math.floor(Math.random() * 10) % 2);
		
		if(random == employeePresent) {
			System.out.println("Employee is Present..|");
		}else {
			System.out.println("Employee is Absent..|");
		}
	}
}
