package PaySlip.Project;

import java.util.Scanner;

import paypro.Project.Employee;
import salaryCalculation.SalaryCal;

public class EmployePayslip {
	public static void main(String[] args) {
		int basic_salary=40000;
		int HA=300;
		int PF=1000;
		int tax=200;
		int MA=200;
		int loan=400;
		Scanner s=new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                          SALARY PAYSLIP                                    ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Enter Id:");
		int id=s.nextInt();
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter age:");
		int age=s.nextInt();
		System.out.println("Enter Leave:");
		int leave=s.nextInt();
		System.out.println("Enter Dept:");
		String dept=s.next();
		System.out.println("Enter MobNo:");
		long mob=s.nextLong();
		System.out.println("Enter Working_days:");
		int days=s.nextInt();
		
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setAge(age);
		e1.setLeave(leave);
		e1.setDept(dept);
		e1.setMobNO(mob);
		e1.setWorking_days(days);
		
		
		SalaryCal sc=new SalaryCal();
		sc.empDetails(e1);
		sc.salary(basic_salary, HA, PF, tax, MA, loan);
		s.close();
	}

}
