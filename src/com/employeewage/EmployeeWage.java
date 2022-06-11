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
		int employeeWagePerHr = 20;
		int employeeHr = 0;
		int random = (int) (Math.floor(Math.random() * 10) % 2);
		
		if(random == employeePresent) {
			System.out.println("Employee is Present..|");
			employeeHr = 8;
		}else {
			System.out.println("Employee is Absent..|");
		}
		
		System.out.println("Daily employee wage is :-> " + employeeWagePerHr * employeeHr);
	}
}
