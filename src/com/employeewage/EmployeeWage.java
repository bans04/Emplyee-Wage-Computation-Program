package com.employeewage;
/*
 * --------------------Employee Wage Computation Program--------------------
 *Print Welcome message
 *-> Check Employee is Present or Absent
 *-> Calculate Employee daily wage
 *-> Calculate Employee daily wage by using switch case
 *-> Calculate Employee wage of month
 *
 *-> Static variable or method we can access without creating object and it also take memory at a once
 *
 *@Dnyandeo Bansode
 *
 **/

public class EmployeeWage {
	static final int fullTime = 1;
	static final int partTime = 2;
	static int employeeWagePerHr = 20;
	static int maxWorkingHr = 100;
	static int maxWorkingDays = 20;
	
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
		int totalWorkingHr = 0;
		int totalWorkingDay = 0;
		int absent = 0;
		int partTimec = 0;
		int fullTimec = 0;
		
		
		//for(int i = 1; i <= 20 && totalEmployeeHr <= maxWorkingHr; i++) {
		while(totalWorkingHr <= maxWorkingHr && totalWorkingDay < maxWorkingDays) {
			int employeeCheck = (int) (Math.floor(Math.random() * 10) % 3);
			
			switch(employeeCheck) {
			case fullTime:
				//System.out.println("Employee is present full time..|");
				employeeHr = 8;
				fullTimec++;
				break;
				
			case partTime:
				//System.out.println("Employee is present part time..|");
				employeeHr = 4;
				partTimec++;
				break;
				
			default:
				//System.out.println("Employee is absent..|");
				absent++;
				employeeHr = 0;
		}
			
		dailyEmployeeWage = employeeWagePerHr * employeeHr;
		totalWorkingHr = totalWorkingHr + employeeHr;
		totalEmployeeWage = totalEmployeeWage + dailyEmployeeWage;
		totalWorkingDay++;
		//System.out.println("Daily employee wage is :-> " + dailyEmployeeWage);
		}
		
		//System.out.println("Employee Absent = " + absent + " Days");
		//System.out.println("Employee present Full time = " + fullTimec + " Days");
		//System.out.println("Employee presnt Part time = " + partTimec + " Days");
		//System.out.println("Total Days = " + totalWorkingDay);
		System.out.print("Employee total working Hr is "+ totalWorkingHr + " in "  + totalWorkingDay + " Days & Wage is:-> " + totalEmployeeWage);
	}
}
