package com.employeewage;
/*
 * --------------------Employee Wage Computation Program--------------------
 *Print Welcome message
 *-> Check Employee is Present or Absent
 *-> Calculate Employee daily wage
 *
 *@Dnyandeo Banosde
 *
 **/

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program..|");
		//int employeePresent = 1;
		final int fullTime = 1;
		final int partTime = 2;
		int employeeWagePerHr = 20;
		int employeeHr = 0;
		int employeeCheck = (int) (Math.floor(Math.random() * 10) % 3);
		
		/*if(random == fullTime) {
			System.out.println("Employee is Present full time..|");
			employeeHr = 8;
		}else {
			//System.out.println("Employee is Absent..|");
			System.out.println("Emplyee is present part time..|");
			employeeHr = 4;
		}*/
		
		switch(employeeCheck) {
		
		case fullTime:
			System.out.println("Employee is present full time..|");
			employeeHr = 8;
			break;
			
		case partTime:
			System.out.println("Employee is present part time..|");
			employeeHr = 4;
			break;
			
		default:
			System.out.println("Employee is absent");
		}
		
		System.out.println("Daily employee wage is :-> " + employeeWagePerHr * employeeHr);
	}
}
