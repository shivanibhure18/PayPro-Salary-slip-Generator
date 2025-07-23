package salaryCalculation;

import paypro.Project.Employee;

public interface Salary {
	void empDetails(Employee e);
	
	void salary(int basic_salary,int HA,int PF,int tax,int MA,int loan);
	}
