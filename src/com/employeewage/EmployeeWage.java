package com.employeewage;
/*
 * --------------------Employee Wage Computation Program--------------------
 *Print Welcome message
 *-> Check Employee is Present or Absent
 *-> Calculate Employee daily wage
 *-> Calculate Employee daily wage by using switch case
 *-> Calculate Employee wage of month
 *
 *@Dnyandeo Banosde
 *
 **/

public class EmployeeWage {
	static final int fullTime = 1;
	static final int partTime = 2;
	static int employeeWagePerHr = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program..|");
		
		/*if(random == fullTime) {
			System.out.println("Employee is Present full time..|");
			employeeHr = 8;
		}else {
			//System.out.println("Employee is Absent..|");
			System.out.println("Emplyee is present part time..|");
			employeeHr = 4;
		}*/
		int employeeHr = 0;
		int totalEmployeeWage = 0;
		int dailyEmployeeWage = 0;
		
		for(int i = 0; i <= 20; i++) {
			int employeeCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch(employeeCheck) {
			case fullTime:
				//System.out.println("Employee is present full time..|");
				employeeHr = 8;
				break;
				
			case partTime:
				//System.out.println("Employee is present part time..|");
				employeeHr = 4;
				break;
				
			default:
				//System.out.println("Employee is absent..|");
		}
			
		dailyEmployeeWage = employeeWagePerHr * employeeHr;
		totalEmployeeWage = totalEmployeeWage + dailyEmployeeWage;
		//System.out.println("Daily employee wage is :-> " + dailyEmployeeWage);
		}
		System.out.print("Calculate wage of month:-> " + totalEmployeeWage);
	}
}
